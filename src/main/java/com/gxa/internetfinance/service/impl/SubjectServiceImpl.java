package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.mapper.BorrowSubjectInfoMapper;
import com.gxa.internetfinance.mapper.BorrowSubjectTypeMapper;
import com.gxa.internetfinance.pojo.po.BorrowSubjectInfo;
import com.gxa.internetfinance.pojo.po.BorrowSubjectType;
import com.gxa.internetfinance.pojo.po.BorrowSubjectTypeExample;
import com.gxa.internetfinance.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author：Win
 * @Date: 2021/6/7 15:05
 * @Description:
 */
@Service
@Transactional(readOnly = true)
public class SubjectServiceImpl implements SubjectService {
    @Resource
    private BorrowSubjectInfoMapper borrowSubjectInfoMapper;

    @Resource
    private BorrowSubjectTypeMapper borrowSubjectTypeMapper;

    /**
     * 添加标的类型信息
     *
     * @param borrowSubjectType 封装了标的类型信息的对象
     * @return result of operation
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer insert(BorrowSubjectType borrowSubjectType) {
        int insert = borrowSubjectTypeMapper.insert(borrowSubjectType);
        if (insert == 0)
            throw new BusinessException("标的类型添加失败~~~");
        return insert;
    }

    /**
     * 添加标的信息
     *
     * @param borrowSubjectInfo 封装了标的信息的对象
     * @return result of operation
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer insert(BorrowSubjectInfo borrowSubjectInfo) {
        borrowSubjectInfo.setGmtCreated(new Date(System.currentTimeMillis()));
        borrowSubjectInfo.setGmtModified(new Date(System.currentTimeMillis()));
        int insert = borrowSubjectInfoMapper.insertSelective(borrowSubjectInfo);
        if (insert == 0)
            throw new BusinessException("标的信息添加失败~~~");
        return insert;
    }

    /**
     * 查询所有的借款标类型
     *
     * @return 结果集
     */
    @Override
    public List<BorrowSubjectType> findAllType() {
        BorrowSubjectTypeExample example = new BorrowSubjectTypeExample();
        example.setOrderByClause("`sort` desc");
        return borrowSubjectTypeMapper.selectByExample(example);
    }

    /**
     * 修改标的类型信息
     *
     * @param borrowSubjectType 要修改的标的类型信息
     * @return result of operation
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
    public Integer update(BorrowSubjectType borrowSubjectType) {
        int update = borrowSubjectTypeMapper.updateByPrimaryKey(borrowSubjectType);
        if (update == 0)
            throw new BusinessException("标的信息更新失败~~~");
        return update;
    }
}
