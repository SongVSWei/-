package com.gxa.internetfinance.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.internetfinance.exception.SystemException;
import com.gxa.internetfinance.mapper.TbPlatformFundsMapper;
import com.gxa.internetfinance.mapper.TbTransactionMapper;
import com.gxa.internetfinance.mapper.TbUserMoneyMapper;
import com.gxa.internetfinance.pojo.po.TbPlatformFunds;
import com.gxa.internetfinance.pojo.po.TbTransaction;
import com.gxa.internetfinance.pojo.po.TbUserMoney;
import com.gxa.internetfinance.pojo.po.TbWidthdraw;
import com.gxa.internetfinance.mapper.TbWidthdrawMapper;
import com.gxa.internetfinance.pojo.vo.WithdrawInfoVo;
import com.gxa.internetfinance.pojo.vo.WithdrawRecordVo;
import com.gxa.internetfinance.pojo.vo.WithdrawVo;
import com.gxa.internetfinance.service.TbWidthdrawService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.UUIDUtil;
import com.gxa.internetfinance.util.WithdrawParam;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 提现表(TbWidthdraw)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 16:53:28
 */
@Transactional
@Service("tbWidthdrawService")
public class TbWidthdrawServiceImpl implements TbWidthdrawService {
    @Resource
    private TbWidthdrawMapper tbWidthdrawMapper;
    @Resource
    private TbTransactionMapper tbTransactionMapper;
    @Resource
    private TbUserMoneyMapper tbUserMoneyMapper;
    @Resource
    private TbPlatformFundsMapper tbPlatformFundsMapper;

    /**
     * 发起提现
     * @param tbWidthdraw
     * @return
     */
    @Override
    public JsonResult withdraw(TbWidthdraw tbWidthdraw){
        //判断电话号码是否为空
        if (tbWidthdraw.getTbWidthdrawUserPhone() == null || tbWidthdraw.getTbWidthdrawUserPhone().isEmpty()) {
            return JsonResult.error().message("电话号码不能为空");
        }
        //判断提现金额是否为空
        if(tbWidthdraw.getTbWidthdrawAmount() == null || tbWidthdraw.getTbWidthdrawAmount() <= 0){
            return JsonResult.error().message("您的提现金额错误");
        }
        //判断银行卡是否为空
        if(tbWidthdraw.getTbWidthdrawBankcard() == null || tbWidthdraw.getTbWidthdrawBankcard().isEmpty()){
            return JsonResult.error().message("您的提现银行卡号不能为空");
        }

        //判断用户余额是否足够提现
        TbUserMoney dbMoney = tbUserMoneyMapper.selectByPhone(tbWidthdraw.getTbWidthdrawUserPhone());
        //判断是否有这个账户
        if(dbMoney == null){
            return JsonResult.error().message("对不起，您的该电话绑定的平台账户的资金不存在");
        }
        if(dbMoney.getTbUserMoneyUsable() < tbWidthdraw.getTbWidthdrawAmount()){
            return JsonResult.error().message("您的可用余额不足以提现");
        }

        //生成交易订单
        TbTransaction tbTransaction = new TbTransaction();

        //设置交易生成时间
        tbTransaction.setTbTransactionCreateTime(new Timestamp(System.currentTimeMillis()));
        //将交易状态设置为处理中
        tbTransaction.setTbTransactionIsSuccess(2);
        //生成唯一标识符的交易流水号
        tbTransaction.setTbTransactionSerialNumber(UUIDUtil.getUid());
        //设置交易类型为提现
        tbTransaction.setTbTransactionType(4);

        //添加进入数据库
        //交易成功就添加进提现表里
        //交易成功
        if(tbTransactionMapper.insert(tbTransaction)  == 1){
            //获取交易订单号
            tbWidthdraw.setTbWidthdrawTransactionId(tbTransaction.getTbTransactionId());
            //将提现开始时间的值设置为交易开始时间
            tbWidthdraw.setTbWidthdrawCreateTime(tbTransaction.getTbTransactionCreateTime());
            //提现手续费（100元0.1元手续,不足100按100的手续费算）
            int num = (int)(tbWidthdraw.getTbWidthdrawAmount()/100);
            System.out.println(num);
            Double poundage = tbWidthdraw.getTbWidthdrawAmount()%100 == 0? num*0.1 : num*0.1+0.1;

            tbWidthdraw.setTbWidthdrawPoundage(poundage);
            //到账金额
            tbWidthdraw.setTbWidhtdrawReceivedMoney(tbWidthdraw.getTbWidthdrawAmount()-poundage);
            System.out.println(tbWidthdraw);
            if(tbWidthdrawMapper.insert(tbWidthdraw) == 1){

                return JsonResult.ok().message("成功发起提现"+tbWidthdraw.getTbWidhtdrawReceivedMoney()+"元");
            }else{
                throw new SystemException(1001,"发起提现失败");
            }

        }else{
            throw new SystemException(1001,"发起交易失败");
        }



    }

    /**
     * 审核
     * @param tbWidthdraw
     * @return
     */
    @Override
    public JsonResult audit(TbWidthdraw tbWidthdraw){
        //判断审核人和提现记录id是否为空
        if (tbWidthdraw.getTbWidthdrawId() == null || tbWidthdraw.getTbWidthdrawAuditor() == null || tbWidthdraw.getTbWidthdrawAuditor().isEmpty()) {
           return JsonResult.error().message("审核人和提现id不能为空");
        }
        if(!(tbWidthdraw.getTbWidthdrawAuditStatus() == 1 || tbWidthdraw.getTbWidthdrawAuditStatus() == 2)){
            return JsonResult.error().message("审核状态只能设置通过（传1）和不通过（传2）");
        }
        //查询数据库（提现记录）
        TbWidthdraw dbDraw = tbWidthdrawMapper.queryById(tbWidthdraw.getTbWidthdrawId());
        if (dbDraw == null) {
            return JsonResult.error().message("该提现记录不存在");
        }
        if(dbDraw.getTbWidthdrawAuditStatus() == 1){
            return JsonResult.error().message("该提现申请已通过，不需要重新审核");
        }
        
        //查询交易流水号
        TbTransaction dbTrans = tbTransactionMapper.queryById(dbDraw.getTbWidthdrawTransactionId());

        //设置更新时间和审核时间
        tbWidthdraw.setTbWidthdrawAuditTime(new Timestamp(System.currentTimeMillis()));
        tbWidthdraw.setTbWidthdrawUpdateTime(new Timestamp(System.currentTimeMillis()));
        //审核
        if (tbWidthdrawMapper.updateAudit(tbWidthdraw) == 1) {
            //查询数据库平台资金
            TbPlatformFunds dbPlat = tbPlatformFundsMapper.selectByAccount();
            //审核通过后才修改平台资金和个人资金
            if(tbWidthdraw.getTbWidthdrawAuditStatus() == 1){
                //审核通过后平台资金和自己的账户资金才减少
                TbPlatformFunds tbPlatformFunds = new TbPlatformFunds();
                //设置流水号
                tbPlatformFunds.setTbPlatformFundsSerialNumber(dbTrans.getTbTransactionSerialNumber());
                //交易类型，1平台充值，2平台提现,3个人充值,4个人提现
                tbPlatformFunds.setTbPlatformFundsTransactionType("个人提现");
                //出入账：0入账，1出账
                tbPlatformFunds.setTbPlatformFundsAccounts("出账");
                //操作金额
                tbPlatformFunds.setTbPlatformFundsMoney(dbDraw.getTbWidthdrawAmount());
                //手续费
                tbPlatformFunds.setTbPlatformFundsPoundage(dbDraw.getTbWidthdrawPoundage());
                //操作前余额
                tbPlatformFunds.setTbPlatformFundsBeforeMoneyAccount(dbPlat.getTbPlatformFundsMoneyAccount());
                //操作后余额
                tbPlatformFunds.setTbPlatformFundsAfterMoneyAccount(dbPlat.getTbPlatformFundsMoneyAccount()-dbDraw.getTbWidthdrawAmount());
                //平台资金
                tbPlatformFunds.setTbPlatformFundsMoneyAccount(tbPlatformFunds.getTbPlatformFundsAfterMoneyAccount());
                tbPlatformFunds.setTbPlatformFundsDesc("提现审核通过，用户资金成功发放");
                //修改平台资金
                if (tbPlatformFundsMapper.insert(tbPlatformFunds) != 1) {
                    //操作失败
                    throw new SystemException(1001,"修改平台资金失败");
                }
                //判断用户资金
                TbUserMoney dbMoney = tbUserMoneyMapper.selectByPhone(dbDraw.getTbWidthdrawUserPhone());
                //修改用户资金
                TbUserMoney tbUserMoney = new TbUserMoney();
                tbUserMoney.setTbMoneyTotal(dbMoney.getTbMoneyTotal()-dbDraw.getTbWidthdrawAmount());
                tbUserMoney.setTbUserMoneyAccount(dbMoney.getTbUserMoneyAccount()-dbDraw.getTbWidthdrawAmount());
                tbUserMoney.setTbUserMoneyUsable(dbMoney.getTbUserMoneyUsable()-dbDraw.getTbWidthdrawAmount());
                tbUserMoney.setTbUserMoneyPhone(dbDraw.getTbWidthdrawUserPhone());
                //修改资金失败
                if (tbUserMoneyMapper.updateChange(tbUserMoney) != 1) {
                    throw new SystemException(1001,"用户资金修改失败");
                }
            }

            //审核状态修改后将交易表修改
            dbTrans.setTbTransactionPublishTime(new Timestamp(System.currentTimeMillis()));
            if(tbWidthdraw.getTbWidthdrawAuditStatus() == 1){
                dbTrans.setTbTransactionIsSuccess(1);
            }else{
                dbTrans.setTbTransactionIsSuccess(0);
            }
            dbTrans.setTbTransactionUpdateTime(new Timestamp(System.currentTimeMillis()));
            if (tbTransactionMapper.update(dbTrans) != 1) {
                throw new SystemException(1001,"修改交易表失败");
            }

            return JsonResult.ok().message("操作成功");
        }else{
            throw new SystemException(1001,"操作失败");
        }



    }

    /**
     * 通过手机号查询最近十五天的提现记录
     * @param phone:用户手机号（唯一索引）
     * @return
     */
    @Override
    public JsonResult LastTimeWithdraw(String phone) {
        //判断手机号是否为空
        if(phone == null || phone.isEmpty()){
            return  JsonResult.error().message("手机号不能为空");
        }
        //获取当前时间
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);

        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(c.DATE, -15);
        //当前时间的十五天前的时间
        Date temp_date = c.getTime();
        System.out.println(sdf.format(temp_date));


        //查询数据库
        List<WithdrawRecordVo> tbWidthdraws = tbWidthdrawMapper.queryByPhone(phone,sdf.format(temp_date)+" 00:00:00",dateNowStr+" 23:59:59");
        return JsonResult.ok().data("tbWidthdraws",tbWidthdraws);

    }

    /**
     * 通过id获取提现信息
     * @param id:提现记录id
     * @return
     */
    @Override
    public JsonResult withInfo(Integer id) {
        //判断id是否为空
        if(id == null || id <= 0){
            return JsonResult.error().message("提现id不能为空");
        }
        //查询数据库
        WithdrawInfoVo infoVo = tbWidthdrawMapper.findById(id);

        return JsonResult.ok().data("withdrawInfo",infoVo);
    }

    /**
     * 通过条件查询获取列表
     * @param param
     * @return
     */
    @Override
    public JsonResult listByParam(WithdrawParam param) {
        System.out.println(param);
        PageHelper.startPage(param.getPage(),param.getLimit());
        List<WithdrawVo> list = tbWidthdrawMapper.queryByParam(param);
        PageInfo<WithdrawVo> objectPageInfo = new PageInfo<>(list);
        objectPageInfo.getList().forEach(System.out::println);
        return JsonResult.ok().data("list",list);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param tbWidthdrawId 主键
     * @return 实例对象
     */
    @Override
    public TbWidthdraw queryById(Integer tbWidthdrawId) {
        return this.tbWidthdrawMapper.queryById(tbWidthdrawId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbWidthdraw> queryAllByLimit(int offset, int limit) {
        return this.tbWidthdrawMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbWidthdraw 实例对象
     * @return 实例对象
     */
    @Override
    public TbWidthdraw insert(TbWidthdraw tbWidthdraw) {
        this.tbWidthdrawMapper.insert(tbWidthdraw);
        return tbWidthdraw;
    }

    /**
     * 修改数据
     *
     * @param tbWidthdraw 实例对象
     * @return 实例对象
     */
    @Override
    public TbWidthdraw update(TbWidthdraw tbWidthdraw) {
        this.tbWidthdrawMapper.update(tbWidthdraw);
        return this.queryById(tbWidthdraw.getTbWidthdrawId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tbWidthdrawId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tbWidthdrawId) {
        return this.tbWidthdrawMapper.deleteById(tbWidthdrawId) > 0;
    }
}
