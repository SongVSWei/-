package com.gxa.internetfinance.mapper;
import com.gxa.internetfinance.pojo.po.Experience;
import com.gxa.internetfinance.pojo.po.NewPeopleActivityStrategy;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.ExperienceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExperirenceMapper {
    public Integer insert(Experience experience);

    public Experience selectById(Integer id);

    List<ExperienceVO> pageCondition(
            @Param("current") Integer current,
            @Param("limit") Integer limit,
            @Param("name") String name,
            @Param("userName") String userName,
            @Param("userPhone") String userPhone,
            @Param("status") String status,
            @Param("condition") String condition);
}

