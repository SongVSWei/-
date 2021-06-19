package com.gxa.internetfinance.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.internetfinance.exception.SystemException;
import com.gxa.internetfinance.mapper.TbPlatformFundsMapper;
import com.gxa.internetfinance.pojo.po.TbPlatformFunds;
import com.gxa.internetfinance.pojo.pram.TbPlatformFundsPram;
import com.gxa.internetfinance.service.TbPlatformFundsService;
import com.gxa.internetfinance.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 蔚枫
 * @version 1.0
 * Talk is cheap. Show me the code
 * @description 平台资金
 * @date 2021/6/9 18:23
 */
@Service("tbPlatformFundsService")
@Transactional(rollbackFor = Exception.class)
@SuppressWarnings("all")
public class TbPlatformFundsServiceImpl implements TbPlatformFundsService {

    @Autowired
    private TbPlatformFundsMapper platformFundsMapper;


    @Override
    public JsonResult selectByAll(TbPlatformFundsPram tbPlatformFundsPram) {
        // 获取分页数据
        PageHelper.startPage(tbPlatformFundsPram.getPage(),tbPlatformFundsPram.getLimit());
        List<TbPlatformFunds> tbPlatformFunds = platformFundsMapper.selectByAll(tbPlatformFundsPram);
        PageInfo<TbPlatformFunds> tbPlatformFundsPageInfo = new PageInfo<>(tbPlatformFunds);

        // 存放分页数据和平台资金
        HashMap<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("tbPlatformFunds",tbPlatformFundsPageInfo);

        // 查找平台资金
        TbPlatformFunds byAccount = platformFundsMapper.selectByAccount();
        stringObjectMap.put("平台资金",byAccount.getTbPlatformFundsMoneyAccount());
        // 返回分页数据和平台资金
        return JsonResult.ok().data(stringObjectMap);
    }

    @Override
    public JsonResult selectByOne(Integer id) {
        System.out.println(":hhhhh");
        throw new SystemException(20003,"失败了");
    }
}
