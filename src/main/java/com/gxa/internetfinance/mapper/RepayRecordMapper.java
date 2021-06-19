package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.vo.RepayRecordVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/10 18:17
 */
public interface RepayRecordMapper {

    List<RepayRecordVO> selectBypage(
            @Param("page") Integer page,
            @Param("size") Integer size,
            @Param("loanMan") String name,
            @Param("phone") String phone,
            @Param("status") String status);

    List<RepayRecordVO> selectAll();

//    Integer countByRepayMgr(RepayManage repayManage);
}
