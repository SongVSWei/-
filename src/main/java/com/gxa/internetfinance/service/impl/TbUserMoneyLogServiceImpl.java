package com.gxa.internetfinance.service.impl;

import com.github.pagehelper.PageHelper;
import com.gxa.internetfinance.mapper.TbUserMoneyLogMapper;
import com.gxa.internetfinance.pojo.po.TbUserMoneyLog;
import com.gxa.internetfinance.service.TbUserMoneyLogService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyLogParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "tbUserMoneyLogService")
public class TbUserMoneyLogServiceImpl implements TbUserMoneyLogService {
    @Resource
    TbUserMoneyLogMapper tbUserMoneyLogMapper;
    /**
     * 通过条件参数分页查询
     * @param param
     * @return
     */
    @Override
    public JsonResult listByParam(MoneyLogParam param) {
        PageHelper.startPage(param.getPage(),param.getLimit());
        List<TbUserMoneyLog> list = tbUserMoneyLogMapper.findByParam(param);

        return JsonResult.ok().data("list",list);
    }
}
