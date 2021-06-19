package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.TbUserMoney;
import com.gxa.internetfinance.pojo.vo.UserMoneyVo;
import com.gxa.internetfinance.util.MoneyParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TbUserMoneyMapper {
    /**
     * 通过参数对象查询
     * @param param
     * @return
     */
    List<UserMoneyVo> findByParam(@Param("param") MoneyParam param);

    /**
     * 通过电话查询
     * @param phone
     * @return
     */
    TbUserMoney selectByPhone(@Param("phone") String phone);

    /**
     * 充值或提现的资金变动
     * @param tbUserMoney
     * @return
     */
    int updateChange(@Param("tbUserMoney") TbUserMoney tbUserMoney);



    int deleteByPrimaryKey(Integer tbUserMoneyId);

    int insert(TbUserMoney record);

    int insertSelective(TbUserMoney record);

    TbUserMoney selectByPrimaryKey(Integer tbUserMoneyId);

    int updateByPrimaryKeySelective(TbUserMoney record);

    int updateByPrimaryKey(TbUserMoney record);
}