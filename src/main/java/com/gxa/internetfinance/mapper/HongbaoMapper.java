package com.gxa.internetfinance.mapper;
import com.gxa.internetfinance.pojo.po.Experience;
import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.pojo.vo.ExperienceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HongbaoMapper {
    public Integer insert(Hongbao hongbao);

    public Hongbao selectById(Integer id);

    List<Hongbao> pageCondition(
            @Param("current") Integer current,
            @Param("limit") Integer limit,
            @Param("name") String name,
            @Param("type") String type);
}
