package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.mapper.BorrowBaseInfoMapper;
import com.gxa.internetfinance.mapper.BorrowGuaranteeMapper;
import com.gxa.internetfinance.mapper.BorrowSubjectInfoMapper;
import com.gxa.internetfinance.mapper.UserMapper;
import com.gxa.internetfinance.pojo.po.*;
import com.gxa.internetfinance.pojo.vo.BorrowInfoQueryVO;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.UserVo;
import com.gxa.internetfinance.service.BorrowBaseInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/5 16:32
 * @Description: 借贷基本信息
 */
@Service
@Transactional(readOnly = true)
public class BorrowBaseInfoServiceImpl implements BorrowBaseInfoService {
    @Resource
    private BorrowBaseInfoMapper borrowBaseInfoMapper;
    @Resource
    private BorrowGuaranteeMapper borrowGuaranteeMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private BorrowSubjectInfoMapper borrowSubjectInfoMapper;

    /**
     * 保存新增的借款信息到数据库中（对应的状态时新标草稿）
     *
     * @param baseInfoVO 基本信息VO对象，包含了担保信息
     * @return 返回成功保存后的自增主键值
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer save(BorrowInfoVO baseInfoVO) {
        BorrowBaseInfo borrowBaseInfo = new BorrowBaseInfo();
        BeanUtils.copyProperties(baseInfoVO, borrowBaseInfo);
//        设置新增借款信息的状态为·新标草稿· 如果存在多次提交的情况，先判断是否为空
        if (borrowBaseInfo.getStatus() == null)
            borrowBaseInfo.setStatus("新标草稿");
//        设置创建时间和更新时间
        if (borrowBaseInfo.getGmtCreated() == null)
            borrowBaseInfo.setGmtCreated(new Date(System.currentTimeMillis()));
        borrowBaseInfo.setGmtModified(new Date(System.currentTimeMillis()));
//        添加新增借款的基本信息，并返回该条新增数据的主键
        int insert = borrowBaseInfoMapper.insert(borrowBaseInfo);
        if (insert == 0) {
            throw new BusinessException("新增借款基本信息保存失败~~~");
        }
//        获取上面添加数据的自增主键
        Integer id = borrowBaseInfo.getId();

        BorrowGuarantee guarantee = new BorrowGuarantee();
        BeanUtils.copyProperties(baseInfoVO.getGuarantee(), guarantee);
//      同上，如果是直接就提交审核而非先保存后再提交审核，需要先判断创建时间是否存在
        if (guarantee.getGmtCreated() == null) {
            guarantee.setGmtCreated(new Date(System.currentTimeMillis()));
        }
//       更新时间
        guarantee.setGmtModified(new Date(System.currentTimeMillis()));

//      将上面的id值关联到guarantee的base_info_id
        guarantee.setBaseInfoId(id);
        borrowGuaranteeMapper.insert(guarantee);

        return id;
    }

    /**
     * 新增借款信息提交审核方法
     *
     * @param baseInfoVO 基本信息VO对象，包含了担保信息
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    @Override
    public void check(BorrowInfoVO baseInfoVO) {
//        new一个BorrowBaseInfo对象
        BorrowBaseInfo borrowBaseInfo = new BorrowBaseInfo();
//        给填充borrowBaseInfo属性
        BeanUtils.copyProperties(baseInfoVO, borrowBaseInfo);
//         这个时候的status置为·新标待审核·
        borrowBaseInfo.setStatus("新标待审核");
//        如果是先保存后再通过编辑跳转来提交审核，那么创建时间和更新时间就已经存在，
//        否则在新增页面直接提交审核，创建时间和更新时间不存在，故需要判断
        if (borrowBaseInfo.getGmtCreated() == null) {
            borrowBaseInfo.setGmtCreated(new Date(System.currentTimeMillis()));
        }
//        提交到审核页面的时间
        borrowBaseInfo.setGmtModified(new Date(System.currentTimeMillis()));
//        添加到数据库
        int insert = borrowBaseInfoMapper.insert(borrowBaseInfo);
        if (insert == 0) {
            throw new BusinessException("新增借款基本信息提交审核失败~~~");
        }

        //        获取上面添加数据的自增主键
        Integer id = borrowBaseInfo.getId();

        BorrowGuarantee guarantee = new BorrowGuarantee();
        BeanUtils.copyProperties(baseInfoVO.getGuarantee(), guarantee);
//      同上，如果是直接就提交审核而非先保存后再提交审核，需要先判断创建时间是否存在
        if (guarantee.getGmtCreated() == null) {
            guarantee.setGmtCreated(new Date(System.currentTimeMillis()));
        }
//       更新时间
        guarantee.setGmtModified(new Date());
//      将上面的id值关联到guarantee的base_info_id
        guarantee.setBaseInfoId(id);
        guarantee.setGmtModified(new Date(System.currentTimeMillis()));
        borrowGuaranteeMapper.insert(guarantee);
    }

    /**
     * 查询所有的新标信息
     *
     * @return 查询到的所有BorrowInfoVO结果集合
     */
    @Override
    public List<BorrowInfoVO> list() {
//        创建一个新的BorrowInfoVO集合对象用来存储查询结果并返回
        List<BorrowInfoVO> borrowInfoVOS = new ArrayList<>();
//        先查询所有的BorrowBaseInfo信息
        List<BorrowBaseInfo> borrowBaseInfos = borrowBaseInfoMapper.selectByExample(null);

//        查询所有的担保信息，获取担保机构信息
        List<BorrowGuarantee> borrowGuarantees = borrowGuaranteeMapper.selectByExample(null);

//        根据新标信息中的手机号查询对应的用户名
        for (BorrowBaseInfo borrowBaseInfo : borrowBaseInfos) {
//            创建集合中要存储的BorrowInfoVO对象
            BorrowInfoVO borrowInfoVO = new BorrowInfoVO();
//            复制属性
            BeanUtils.copyProperties(borrowBaseInfo, borrowInfoVO);
//            查询新标对应的是用户名
            UserVo user = userMapper.selectByPhone(borrowBaseInfo.getUserPhone());
//            设置用户名到BorrowInfoVO对象中
            borrowInfoVO.setUserName(user.getName());
//          遍历担保信息，获取和当前标对应的担保信息
            for (BorrowGuarantee borrowGuarantee : borrowGuarantees) {
                if (borrowBaseInfo.getId().equals(borrowGuarantee.getBaseInfoId())) {
//                    设置担保信息到BorrowInfoVO对象中
                    borrowInfoVO.setGuarantee(borrowGuarantee);
                }
            }
//            将BorrowInfoVO对象添加到集合中
            borrowInfoVOS.add(borrowInfoVO);
        }
        return borrowInfoVOS;
    }

    /**
     * 条件分页查询
     *
     * @param current           当前页
     * @param limit             每页显示的数量
     * @param borrowInfoQueryVO 条件查询封装对象
     * @return result of operation
     */
    @Override
    public List<BorrowInfoVO> pageCondition(Integer current, Integer limit, BorrowInfoQueryVO borrowInfoQueryVO, String condition) {
        String name = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getName();
        String userName = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getUserName();
        String userPhone = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getUserPhone();
        String status = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getStatus();
        String loanType = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getLoanType();
        if (status == null || status.contains("全部"))
            status = null;
        if (loanType == null || loanType.contains("全部"))
            loanType = null;
        List<BorrowInfoVO> list = borrowBaseInfoMapper.pageCondition((current - 1) * limit, limit,
                name, userName, userPhone, status, loanType, condition);
//        list中没有担保信息，所以还需要查询对应的担保信息
        List<BorrowGuarantee> borrowGuarantees = borrowGuaranteeMapper.selectByExample(null);
        //        查询标的详细信息
        List<BorrowSubjectInfo> borrowSubjectInfos = borrowSubjectInfoMapper.selectByExample(null);
        for (BorrowInfoVO borrowInfoVO : list) {
//            如果担保信息不为空或者不是一个空列表，才进行遍历，否则或出现@code｛NullPointerException｝异常
            if (borrowGuarantees != null && borrowGuarantees.size() != 0) {
                for (BorrowGuarantee borrowGuarantee : borrowGuarantees) {
                    if (borrowInfoVO.getId().equals(borrowGuarantee.getBaseInfoId())) {
                        borrowInfoVO.setGuarantee(borrowGuarantee);
                    }
                }
            }
//            如果标的详细信息不为空或者不是一个空列表，才进行遍历，否则或出现@code｛NullPointerException｝异常
            if (borrowSubjectInfos != null && borrowSubjectInfos.size() != 0) {
                for (BorrowSubjectInfo borrowSubjectInfo : borrowSubjectInfos) {
                    if (borrowInfoVO.getId().equals(borrowSubjectInfo.getId())) {
                        borrowInfoVO.setBorrowSubjectInfo(borrowSubjectInfo);
//                    投资进度=已投金额/借款总金额（raisedAmount/total）
                        if (borrowSubjectInfo.getRaisedAmount() != null && borrowInfoVO.getTotal() != null) {
                            String investmentProgress = BigDecimal.valueOf(borrowSubjectInfo.getRaisedAmount() / borrowInfoVO.getTotal() * 100).setScale(2, BigDecimal.ROUND_HALF_UP) + "%";
                            borrowInfoVO.setInvestmentProgress(investmentProgress);
                        }

                    }
                }
            }
//            填充借款管理费字段属性---管理费=借款金额*借款管理费月率
            if (borrowInfoVO.getLoanMgrInterestRate() != null && borrowInfoVO.getTotal() != null) {
                BigDecimal loanManagementFee = BigDecimal.valueOf(borrowInfoVO.getTotal() * borrowInfoVO.getLoanMgrInterestRate()).setScale(2, BigDecimal.ROUND_HALF_UP);
                borrowInfoVO.setLoanManagementFee(loanManagementFee);
            }
        }
        return list;
    }

    /**
     * 查询符合条件分页结果的总条数
     *
     * @param borrowInfoQueryVO 查询条件
     * @return 总记录数
     */
    @Override
    public int countCondition(BorrowInfoQueryVO borrowInfoQueryVO, String condition) {
        String name = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getName();
        String userName = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getUserName();
        String userPhone = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getUserPhone();
        String status = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getStatus();
        String loanType = borrowInfoQueryVO == null ? null : borrowInfoQueryVO.getLoanType();
        if (status == null || status.contains("全部"))
            status = null;
        if (loanType == null || loanType.contains("全部"))
            loanType = null;
        return borrowBaseInfoMapper.countCondition(name, userName, userPhone, status, loanType, condition);
    }

    /**
     * 更新新增借款信息的方法
     *
     * @param baseInfoVO 要更新信息封装的对象
     * @return result of operation
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer update(BorrowInfoVO baseInfoVO) {
//        新建一个BorrowBaseInfo对象和BorrowGuarantee对象用来更新信息
        BorrowBaseInfo borrowBaseInfo = new BorrowBaseInfo();
        BeanUtils.copyProperties(baseInfoVO, borrowBaseInfo);
//        设置更新时间
        borrowBaseInfo.setGmtModified(new Date(System.currentTimeMillis()));
        int update = borrowBaseInfoMapper.updateByPrimaryKey(borrowBaseInfo);
        if (update == 0)
            throw new BusinessException("借款信息更新失败~~~");
        BorrowGuarantee borrowGuarantee = new BorrowGuarantee();
        BeanUtils.copyProperties(baseInfoVO.getGuarantee(), borrowGuarantee);
//        设置更新时间
        borrowGuarantee.setGmtModified(new Date(System.currentTimeMillis()));
//        根据baseInfoID来更新担保信息
        BorrowGuaranteeExample example = new BorrowGuaranteeExample();
        BorrowGuaranteeExample.Criteria criteria = example.createCriteria();
        criteria.andBaseInfoIdEqualTo(baseInfoVO.getGuarantee().getBaseInfoId());
        borrowGuaranteeMapper.updateByExampleSelective(borrowGuarantee, example);
//        更新标的具体信息
        if (baseInfoVO.getBorrowSubjectInfo() != null) {
            BorrowSubjectInfo borrowSubjectInfo = new BorrowSubjectInfo();
            BeanUtils.copyProperties(baseInfoVO.getBorrowSubjectInfo(), borrowSubjectInfo);
            borrowSubjectInfoMapper.updateByPrimaryKey(borrowSubjectInfo);
        }
        return update;
    }

    /**
     * 根据自增主键id查询信息
     *
     * @param baseInfoId 自增主键id值
     * @return result of operation
     */
    @Override
    public BorrowInfoVO get(Integer baseInfoId) {
        List<BorrowInfoVO> list = this.pageCondition(1, 1, null, String.valueOf(baseInfoId));
        if (list == null || list.size() == 0) {
            throw new BusinessException("不存在当前标号的信息，请重新输入~~~");
        }
        return list.get(0);
    }
}
