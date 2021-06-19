package com.gxa.internetfinance.service;

import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyLogParam;

public interface TbUserMoneyLogService {


    /**
     * 通过参数分页查询列表
     * @param param
     * @return
     */
    JsonResult listByParam(MoneyLogParam param);

}
