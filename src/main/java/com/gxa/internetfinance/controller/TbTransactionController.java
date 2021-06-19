package com.gxa.internetfinance.controller;

import com.gxa.internetfinance.pojo.po.TbTransaction;
import com.gxa.internetfinance.service.TbTransactionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 交易表(TbTransaction)表控制层
 *
 * @author makejava
 * @since 2021-06-07 16:54:16
 */
@RestController
@RequestMapping("tbTransaction")
public class TbTransactionController {
    /**
     * 服务对象
     */
    @Resource
    private TbTransactionService tbTransactionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbTransaction selectOne(Integer id) {
        return this.tbTransactionService.queryById(id);
    }

}
