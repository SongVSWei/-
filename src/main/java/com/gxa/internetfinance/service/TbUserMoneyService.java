package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.TbWidthdraw;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyParam;

public interface TbUserMoneyService {
    /**
     * 根据条件分页查询
     * @param param:条件参数对象
     * @return
     */
    JsonResult listByParam(MoneyParam param);

    /**
     * 通过电话查询资金
     */
    JsonResult findByPhone(String phone);

}
