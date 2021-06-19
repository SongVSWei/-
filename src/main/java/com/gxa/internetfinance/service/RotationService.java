package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.Rotation;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

public interface RotationService {
    Integer Delete(Integer id);
    Integer insert(Rotation rotation) throws ParseException;
    Integer Update(Rotation rotation);
    HashMap<String,Object> select(Rotation rotation, Integer page, Integer size);

}
