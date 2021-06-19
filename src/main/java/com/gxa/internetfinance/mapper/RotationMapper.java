package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.Rotation;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.HashMap;
import java.util.List;

public interface RotationMapper {
    Integer insertByRotation(Rotation rotation);

   List<Rotation>selectComprehensive(HashMap<String,Object> hashMap);

   Integer selectCount(HashMap<String,Object> hashMap);
    Integer updateByEditAll(Rotation rotation);
    Integer deleteById(Integer id);
}