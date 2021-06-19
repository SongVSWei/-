package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.User;
import com.gxa.internetfinance.pojo.vo.UserVo;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    /**
     *个人用户添加方法
     *
     */
    Integer personalInsert(User user);

    /**
     *企业用户添加方法
     *
     */

    Integer companyinsert(User user);

    /**
     *三个条件的综合查询方法
     *
     */

    List<User> select(User user,Integer page,Integer size );



    /**
     *根据ID查询个人用户数据
     *
     */
    UserVo selectPersonalDetailsById(Integer id);


    /**
     *根据ID查询公司用户数据
     *
     */
    UserVo selectCompanyDetailsById(Integer id);


    List<User> selectWhole(User user,Integer page,Integer size);

    Integer selectAllCounts();
    Integer selectCounts();

    Integer selectTotalCounts(User user);
    Integer selectWholeCounts(User user);

    Integer updateInvestUserById(UserVo user,@Param("id")Integer id);

    UserVo selectById (Integer id);

    Integer updatePersonalLendingUserById(UserVo userVo,@Param("id") Integer id);

    Integer updateCompanylLendingUserById(UserVo userVo,@Param("id") Integer id);
}
