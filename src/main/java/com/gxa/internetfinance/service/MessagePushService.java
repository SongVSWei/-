package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.po.MessagePush;

import java.util.List;

public interface MessagePushService {
    /**
     * 新增
     * @return
     */
    Integer register(MessagePush messagePush);
    /**
     * 消息推送模块下条件分页查询
     * @param page 当前页
     * @param size 每页显示的数量
     * @return result of operation
     */
    List<MessagePush> pageCondition(Integer page, Integer size, String title, String status);
}
