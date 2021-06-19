package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.ChechkInStrategy;
import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.po.MessagePush;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessagePushMapper {

    public Integer insert(MessagePush messagePush);
    List<MessagePush> pageCondition(
            @Param("current") Integer current,
            @Param("limit") Integer limit,
            @Param("title") String title,
            @Param("status") String status);
}
