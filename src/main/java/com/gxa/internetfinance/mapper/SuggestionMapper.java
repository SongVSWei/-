package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.Suggestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface SuggestionMapper {

    @Insert("insert into tb_suggestion (suggestion_PhoneModel,suggestion_desc,suggestion_ideaSourse," +
            "suggestion_expireTime,suggestion_inHandle,suggestion_phone,suggestion_response) " +
            "values (#{phoneModel},#{desc},#{ideaSourse},#{expireTime},#{inHandle},#{phone},#{response})")
    Integer insert(Suggestion suggestion);

    Integer selectCount(HashMap<String, Object> hashMap);

    //    int insertSelective(Suggestion record);
//@Select({"<secipt>select * from tb_suggestion  <where>" +
//        "<if test=\"desc!=null and desc != '' \">\n" +
//        "                and suggestion_desc  like concat('%', #{desc}, '%')\n" +
//        "            </if> <if test=\"inHandle!=null and inHandle != '' \">\n" +
//        "                and suggestion_inHandle = #{inHandle}\n" +
//        "            </if>    </where> limit  #{page},#{size}</secript>"})
    List<Suggestion> selectByPrimaryKey(HashMap<String, Object> hashMap);


    Integer updateByInHandle(Integer id,String response);
}