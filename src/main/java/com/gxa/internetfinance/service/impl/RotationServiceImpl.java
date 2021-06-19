package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.RotationMapper;
import com.gxa.internetfinance.pojo.po.Rotation;
import com.gxa.internetfinance.service.RotationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class RotationServiceImpl implements RotationService {
    @Resource
    private RotationMapper rotationMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer Delete(Integer id) {
        int i = rotationMapper.deleteById(id);
        return i;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insert(Rotation rotation) throws ParseException {
//        Date startTime = rotation.getStartTime();
//        String replace = startTime.toString().replace("T", " ");
//        String substring = replace.substring(0, replace.length() - 5);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z yyyy");
//        Date parse = format.parse(substring);
//
//        Date stopTime = rotation.getStopTime();
//        String replace1 = stopTime.toString().replace("T", " ");
//        String substring1 = replace.substring(0, replace1.length() - 5);
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z yyyy");
//        System.out.println(substring);
//        System.out.println(substring1);
//        Date parse1 = format1.parse(substring1);
//        System.out.println(parse1);
//        System.out.println(parse);
//
//        rotation.setStartTime(parse);
//        rotation.setStopTime(parse1);
        int i = rotationMapper.insertByRotation(rotation);
        return i;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer Update(Rotation rotation) {

        int i = rotationMapper.updateByEditAll(rotation);
        return i;
    }

    @Override
    public HashMap<String,Object> select(Rotation rotation, Integer page, Integer size) {
        HashMap<String, Object> HashMap = new HashMap<>();
        HashMap.put("name",rotation.getName());
        HashMap.put("desc",rotation.getDesc());
        HashMap.put("inUse",rotation.getInUse());
        HashMap.put("page",(page-1)*size);
        HashMap.put("size",size);

        List<Rotation> rotations = rotationMapper.selectComprehensive(HashMap);
        HashMap<String, Object> HashMap1 = new HashMap<>();
        HashMap1.put("rotations",rotations);
        Integer count = rotationMapper.selectCount(HashMap);
        HashMap1.put("count",count);
        return HashMap1;
    }
}
