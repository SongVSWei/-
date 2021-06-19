package com.gxa.internetfinance.mapper;


import com.gxa.internetfinance.pojo.po.User;
import com.gxa.internetfinance.pojo.po.UserExample;
import com.gxa.internetfinance.pojo.vo.UserVo;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

    Integer personalinsert(User user);
    Integer companyinsert(User user);

    List<User> selectComprehensive(HashMap<String,Object> hashMap);
    List<User> selectWhole(HashMap<String,Object> hashMap);

    UserVo selectByPhone(@Param("userPhone") String userPhone);
    UserVo selectIdByPhone(String userPhone);
    UserVo selectIdByIdNum(String idNum);
    UserVo selectIdByTag(String tag);
    UserVo selectPersonalDetailsById(Integer id);
    UserVo selectCompanyDetailsById(Integer id );

    UserVo selectById(Integer id);

    @Select("select count(*) from tb_user")
    Integer selectAllCounts();

    @Select("select count(*) from tb_user where user_role = \"投资用户\"")
    Integer selectCounts();

    Integer selectTotalCounts(HashMap<String,Object> hashMap);

    Integer selectWholeCounts(HashMap<String,Object> hashMap);

    Integer updateInvestUserById(HashMap<String,Object> hashMap);

    Integer updatePersonalLendingUserById(HashMap<String,Object> hashMap);

    Integer updateCompanylLendingUserById(HashMap<String,Object> hashMap);
}