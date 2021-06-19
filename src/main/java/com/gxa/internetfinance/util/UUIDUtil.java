package com.gxa.internetfinance.util;

import java.util.UUID;

public class UUIDUtil {
    /**
     * 获取唯一字符串
     * @return
     */
    public static String getUid(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }


}
