package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.Suggestion;
import com.gxa.internetfinance.pojo.po.Version;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

public interface VersionMapper {

    @Insert("insert into tb_version (version_name,version_UpdateDesc,version_platform," +
            "version_expireTime,version_inEffective,version_number,version_uploadApplication," +
            "version_uploadOne,version_uploadTwo,version_uploadOfficial) " +
            "values (#{name},#{updateDesc},#{platform},#{expireTime},#{inEffective},#{number}," +
            "#{uploadApplication},#{uploadone},#{uploadTwo},#{uploadOffcial})")
    Integer insert(Version version);

    //    int insertSelective(Suggestion record);
//@Select({"<secipt>select * from tb_suggestion  <where>" +
//        "<if test=\"desc!=null and desc != '' \">\n" +
//        "                and suggestion_desc  like concat('%', #{desc}, '%')\n" +
//        "            </if> <if test=\"inHandle!=null and inHandle != '' \">\n" +
//        "                and suggestion_inHandle = #{inHandle}\n" +
//        "            </if>    </where> limit  #{page},#{size}</secript>"})
    List<Version> selectByPrimaryKey(HashMap<String, Object> hashMap);


    Integer selectCount(HashMap<String, Object> hashMap);

    @Update("update tb_version set version_inEffective=0 where version_id=#{param1}")
    Integer updateByInEffictive(Integer id);
}