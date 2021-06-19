package com.gxa.internetfinance.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.internetfinance.exception.SystemException;
import com.gxa.internetfinance.mapper.*;
import com.gxa.internetfinance.pojo.po.TbCharge;
import com.gxa.internetfinance.pojo.po.TbPlatformFunds;
import com.gxa.internetfinance.pojo.po.TbTransaction;
import com.gxa.internetfinance.pojo.po.TbUserMoney;
import com.gxa.internetfinance.pojo.pram.TbChargePram;
import com.gxa.internetfinance.pojo.vo.TbChargeVo;
import com.gxa.internetfinance.service.TbChargeService;
import com.gxa.internetfinance.util.JsonResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

import java.util.List;
import java.util.UUID;

/**
 * 充值表(TbCharge)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 16:52:40
 */
@Service("tbChargeService")
@Transactional(rollbackFor = Exception.class)
public class TbChargeServiceImpl implements TbChargeService {
    /*@Autowired
    private MyValidator validator;*/

    @Resource
    private TbChargeMapper tbChargeMapper;
    @Resource
    private TbTransactionMapper transactionDao;
    @Resource
    private TbUserMapper tbUserMapper;
    @Resource
    private TbPlatformFundsMapper tbPlatformFundsMapper;
    @Resource
    private TbUserMoneyMapper tbUserMoneyMapper;
    /**
     * 通过ID查询单条数据
     *
     * @param tbChargeId 主键
     * @return 实例对象
     */
    @Override
    public JsonResult queryById(Integer tbChargeId) {
        if (tbChargeId <= 0) {
            return JsonResult.error().message("你输入的id有误");
        }
        TbCharge tbCharge = this.tbChargeMapper.queryById(tbChargeId);
        return JsonResult.ok().data("tbCharge", tbCharge);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbCharge> queryAllByLimit(int offset, int limit) {
        return this.tbChargeMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增充值记录
     *
     * @param tbCharge 实例对象
     * @return 实例对象
     */
    @Override
    public JsonResult insert(TbCharge tbCharge) {
        // 让到账金额=入账金额
        tbCharge.setTbChargeReceivedMoney(tbCharge.getTbChargeMoney());
        TbUserMoney tbUserMoney = tbUserMoneyMapper.selectByPhone(tbCharge.getTbChargeUserPhone());
        // 验证是否有这个人呢
        if (tbUserMoney==null){
            throw new SystemException(20001, "找不到该手机对应的账号，请核对手机号是否正确，充值失败");
        }
        // 1.先管订单
        tbCharge.setTbChargeCreateTime(new Timestamp(System.currentTimeMillis()));
        TbTransaction tbTransaction = new TbTransaction();
        // 生成交易订单时间
        tbTransaction.setTbTransactionCreateTime(new Timestamp(System.currentTimeMillis()));
        // 生成唯一交易流水号
        tbTransaction.setTbTransactionSerialNumber(UUID.randomUUID().toString());
        // 交易完成时间
        tbTransaction.setTbTransactionPublishTime(new Timestamp(System.currentTimeMillis()));
        tbTransaction.setTbTransactionUpdateTime(new Timestamp(System.currentTimeMillis()));
        // 是否成功
        tbTransaction.setTbTransactionIsDeleted(0);
        tbTransaction.setTbTransactionIsSuccess(1);
        //交易类型
        tbTransaction.setTbTransactionType(1);


        // 存储交易订单
        if (transactionDao.insert(tbTransaction) > 0) {
            // 2.将交易单订号放入充值表中
            tbCharge.setTbChargeTransactionId(tbTransaction.getTbTransactionId());
            // 存充值记录
            if (this.tbChargeMapper.insert(tbCharge) > 0) {
                // 3. 充值完成后修改user的资金

                // 修改个人资金表
                tbUserMoney.setTbMoneyTotal(tbUserMoney.getTbMoneyTotal()+tbCharge.getTbChargeMoney());
                tbUserMoney.setTbUserMoneyAccount(tbUserMoney.getTbUserMoneyAccount()+tbCharge.getTbChargeMoney());
                tbUserMoney.setTbUserMoneyUsable(tbUserMoney.getTbUserMoneyUsable()+tbCharge.getTbChargeMoney());
                if (tbUserMoneyMapper.updateChange(tbUserMoney)>0) {
                    // 4. 修改平台的资金，生成平台资金记录

                    // 查找平台资金
                    TbPlatformFunds byAccount = tbPlatformFundsMapper.selectByAccount();
                    // 注入唯一流水号
                    byAccount.setTbPlatformFundsSerialNumber(tbTransaction.getTbTransactionSerialNumber());
                    // 交易类型
                    byAccount.setTbPlatformFundsTransactionType("个人充值");
                    // 出入账：0入账，1出账
                    byAccount.setTbPlatformFundsAccounts("入账");
                    // 手续费
                    byAccount.setTbPlatformFundsPoundage(0D);
                    // 操作前余额
                    byAccount.setTbPlatformFundsBeforeMoneyAccount(byAccount.getTbPlatformFundsMoneyAccount());
                    // 操作后余额
                    byAccount.setTbPlatformFundsAfterMoneyAccount(byAccount.getTbPlatformFundsMoneyAccount()+tbCharge.getTbChargeMoney());
                    // 状态，0失败，1成功
                    byAccount.setTbPlatformFundsStatus(1);
                    // 备注
                    byAccount.setTbPlatformFundsDesc("个人充值成功了");
                    // 操作时间
                    byAccount.setTbPlatformFundsTime(new Timestamp(System.currentTimeMillis()));
                    // 平台资金
                    byAccount.setTbPlatformFundsMoneyAccount(byAccount.getTbPlatformFundsMoneyAccount()-tbCharge.getTbChargeMoney());
                    if (tbPlatformFundsMapper.insertSelective(byAccount)>0) {
                        return JsonResult.error().message("充值成功");

                    }
                    throw new SystemException(20001, "充值失败");
                }

                // 充值失败,修改交易记录表状态为失败
                throw new SystemException(20001, "充值失败");
            }
            
            // 充值失败,修改交易记录表状态为失败
            throw new SystemException(20001, "充值失败");

        }
        // 交易失败，删除交易记录
        throw new SystemException(20001, "交易失败");
    }

    /**
     * 修改数据
     *
     * @param tbCharge 实例对象
     * @return 实例对象
     */
    @Override
    public JsonResult update(TbCharge tbCharge) {
        this.tbChargeMapper.update(tbCharge);
        return JsonResult.ok().data("tbCharge", tbCharge).message("success");
    }

    /**
     * 通过主键删除数据
     *
     * @param tbChargeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tbChargeId) {
        return this.tbChargeMapper.deleteById(tbChargeId) > 0;
    }

    /**
     * 带条件的查询所有分页
     * @param tbChargePram
     * @return
     */
    @Override
    public JsonResult selectByAll(TbChargePram tbChargePram) {
        System.out.println(tbChargePram);
        PageHelper.startPage(tbChargePram.getPage(),tbChargePram.getLimit());
        List<TbChargeVo> tbChargeVos = tbChargeMapper.selectByAll(tbChargePram);

        PageInfo<TbChargeVo> tbChargeVoPageInfo = new PageInfo<>(tbChargeVos);

        return JsonResult.ok().data("tbChargeVos",tbChargeVoPageInfo);
    }
}
