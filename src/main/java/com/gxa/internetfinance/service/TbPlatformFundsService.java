package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.pram.TbPlatformFundsPram;
import com.gxa.internetfinance.util.JsonResult;

/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 平台资金
 * @date 2021/6/9 18:23
 */

public interface TbPlatformFundsService {

    /**
     * 带条件的分页查询
     * @param tbPlatformFundsPram
     * @return
     */
    JsonResult selectByAll(TbPlatformFundsPram tbPlatformFundsPram);

    /**
     * 查询单条语句
     * @param id
     * @return
     */
    JsonResult selectByOne(Integer id);
}
