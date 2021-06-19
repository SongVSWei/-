package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.pojo.po.TbTransaction;
import com.gxa.internetfinance.mapper.TbTransactionMapper;
import com.gxa.internetfinance.service.TbTransactionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 交易表(TbTransaction)表服务实现类
 *
 * @author makejava
 * @since 2021-06-07 16:54:15
 */
@Service("tbTransactionService")
public class TbTransactionServiceImpl implements TbTransactionService {
    @Resource
    private TbTransactionMapper tbTransactionMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param tbTransactionId 主键
     * @return 实例对象
     */
    @Override
    public TbTransaction queryById(Integer tbTransactionId) {
        return this.tbTransactionMapper.queryById(tbTransactionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbTransaction> queryAllByLimit(int offset, int limit) {
        return this.tbTransactionMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbTransaction 实例对象
     * @return 实例对象
     */
    @Override
    public TbTransaction insert(TbTransaction tbTransaction) {
        this.tbTransactionMapper.insert(tbTransaction);
        return tbTransaction;
    }

    /**
     * 修改数据
     *
     * @param tbTransaction 实例对象
     * @return 实例对象
     */
    @Override
    public TbTransaction update(TbTransaction tbTransaction) {
        this.tbTransactionMapper.update(tbTransaction);
        return this.queryById(tbTransaction.getTbTransactionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tbTransactionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tbTransactionId) {
        return this.tbTransactionMapper.deleteById(tbTransactionId) > 0;
    }
}
