package com.gxa.internetfinance.service.impl;

import com.github.pagehelper.PageHelper;
import com.gxa.internetfinance.mapper.TbUserMoneyMapper;
import com.gxa.internetfinance.pojo.po.TbUserMoney;
import com.gxa.internetfinance.pojo.vo.UserMoneyVo;
import com.gxa.internetfinance.service.TbUserMoneyService;
import com.gxa.internetfinance.util.JsonResult;
import com.gxa.internetfinance.util.MoneyParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TbUserMoneyServiceImpl implements TbUserMoneyService {
    @Resource
    private TbUserMoneyMapper tbUserMoneyMapper;

    /**
     * 通过条件分页查询
     * @param param:条件参数对象
     * @return
     */
    @Override
    public JsonResult listByParam(MoneyParam param) {
        PageHelper.startPage(param.getPage(),param.getLimit());
        List<UserMoneyVo> list = tbUserMoneyMapper.findByParam(param);
        return JsonResult.ok().data("list",list);
    }

    /**
     * 通过电话查询
     * @param phone
     * @return
     */
    @Override
    public JsonResult findByPhone(String phone) {
        //判断号码是否为空
        if(phone == null || phone.isEmpty()){
            return JsonResult.error().message("手机号码不能为空");
        }
        TbUserMoney tbUserMoney = tbUserMoneyMapper.selectByPhone(phone);
        return JsonResult.ok().data("moneyInfo",tbUserMoney);
    }
}
