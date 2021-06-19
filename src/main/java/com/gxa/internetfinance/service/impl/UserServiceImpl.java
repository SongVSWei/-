package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.exception.BusinessException;
import com.gxa.internetfinance.mapper.UserMapper;
import com.gxa.internetfinance.pojo.po.User;
import com.gxa.internetfinance.pojo.vo.UserVo;
import com.gxa.internetfinance.service.UserService;
import com.gxa.internetfinance.util.MD5Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


@Transactional(rollbackFor = Throwable.class)
@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper = null;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer personalInsert(User user) {

        if(user.getIdNum()!=null){
            user.setIdStatus("已实名");
        }
        if(user.getUserType().equals("1")){
            user.setUserType("个人用户");
        }else{
            user.setUserType("企业用户");
        }

        UserVo userVo = userMapper.selectIdByPhone(user.getPhone());
        UserVo userVo1 = userMapper.selectIdByIdNum(user.getIdNum());

        if(userVo == null){
            if(userVo1== null){
                user.setPwd(MD5Util.encode(user.getPwd()));
                Integer personalinsert = userMapper.personalinsert(user);

                if(personalinsert ==0){
                    throw new BusinessException("添加失败");
                }else{
                    return personalinsert;
                }
            }else{
                throw new BusinessException("用户身份证号已重复 添加失败");
            }
        }else {
            throw new BusinessException("用户手机号已重复 添加失败");
        }


    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer companyinsert(User user) {
       if((user.getLegalPersonName()!=null)&(user.getTagRegName()!=null)){
           user.setIdStatus("已实名");
       }
        if(user.getUserType().equals("1")){
            user.setUserType("个人用户");
        }else{
            user.setUserType("企业用户");
        }

        UserVo userVo = userMapper.selectIdByPhone(user.getPhone());
        UserVo userVo1 = userMapper.selectIdByTag(user.getTagRegName());

        if(userVo == null){
            if(userVo1 == null){
                user.setPwd(MD5Util.encode(user.getPwd()));
                Integer companyinsert = userMapper.companyinsert(user);

                if(companyinsert  ==0){
                    throw new BusinessException("添加失败");
                }else{
                    return companyinsert ;
                }
            }else{
                throw new BusinessException("企业税务登记证号已重复 添加失败");
            }
        }else {
            throw new BusinessException("企业用户手机号已重复 添加失败");
        }

    }


    @Override
    public List<User> select(User user, Integer page, Integer size) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("page",(page-1)*size);
        hashMap.put("size",size);


        List<User> ListU = userMapper.selectComprehensive(hashMap);

        return ListU;
    }

    @Override
    public UserVo selectPersonalDetailsById(Integer id) {

        UserVo userVo = userMapper.selectPersonalDetailsById(id);

        return userVo;
    }

    @Override
    public UserVo selectCompanyDetailsById(Integer id) {

        UserVo userVo = userMapper.selectCompanyDetailsById(id);
        return userVo;
    }

    @Override
    public List<User> selectWhole(User user, Integer page, Integer size) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("idStatus",user.getIdStatus());
        hashMap.put("resource",user.getResource());
        hashMap.put("page",(page-1)*size);
        hashMap.put("size",size);

        List<User> users = userMapper.selectWhole(hashMap);
        return users;
    }

    @Override
    public Integer selectAllCounts() {
        Integer Counts = userMapper.selectAllCounts();
        return Counts;
    }

    @Override
    public Integer selectCounts() {
        Integer Counts = userMapper.selectCounts();
        return Counts;
    }

    @Override
    public Integer selectTotalCounts(User user) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("lockStatus",user.getLockStatus());

        Integer Counts = userMapper.selectTotalCounts(hashMap);
        return Counts;
    }

    @Override
    public Integer selectWholeCounts(User user) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("idStatus",user.getIdStatus());
        hashMap.put("resource",user.getResource());

        Integer integer = userMapper.selectWholeCounts(hashMap);
        return integer;

    }

    @Override
    public Integer updateInvestUserById(UserVo user,Integer id) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("idNum",user.getIdNum());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("remarks",user.getRemarks());
        hashMap.put("id",id);
        Integer integer = userMapper.updateInvestUserById(hashMap);
        return integer;
    }

    @Override
    public UserVo selectById(Integer id) {
        UserVo userVo = userMapper.selectById(id);
        return userVo;
    }

    @Override
    public Integer updatePersonalLendingUserById(UserVo user, Integer id) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("idNum",user.getIdNum());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("remarks",user.getRemarks());
        hashMap.put("id",id);
        hashMap.put("email",user.getEmail());
        hashMap.put("gender",user.getGender());
        Integer integer = userMapper.updatePersonalLendingUserById(hashMap);
        return integer;
    }

    @Override
    public Integer updateCompanylLendingUserById(UserVo user, Integer id) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",user.getName());
        hashMap.put("phone",user.getPhone());
        hashMap.put("id",id);
        hashMap.put("email",user.getEmail());
        hashMap.put("lockStatus",user.getLockStatus());
        hashMap.put("legalPersonName",user.getLegalPersonName());
        hashMap.put("tagRegName",user.getTagRegName());
        Integer integer = userMapper.updateCompanylLendingUserById(hashMap);
        return integer;
    }


}
