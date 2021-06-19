package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.TbUserMoneyLog;
import com.gxa.internetfinance.util.MoneyLogParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMoneyLogMapper {
    /**
     * 按条件参数查询
     * @param param
     * @return
     */
    List<TbUserMoneyLog> findByParam(@Param("param")MoneyLogParam param);


    int deleteByPrimaryKey(Integer tbUserMoneyLogId);

    int insert(TbUserMoneyLog record);

    int insertSelective(TbUserMoneyLog record);

    TbUserMoneyLog selectByPrimaryKey(Integer tbUserMoneyLogId);

    int updateByPrimaryKeySelective(TbUserMoneyLog record);

    int updateByPrimaryKey(TbUserMoneyLog record);
}