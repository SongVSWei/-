package com.gxa.internetfinance.mapper;

import com.gxa.internetfinance.pojo.po.BorrowBaseInfo;
import com.gxa.internetfinance.pojo.po.BorrowBaseInfoExample;
import com.gxa.internetfinance.pojo.po.RepayManage;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.RepayManageVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 11:41
 */
public interface RepayManageMapper {

    List<RepayManageVO> selectBypage(
            @Param("page") Integer page,
            @Param("size") Integer size,
            @Param("loanMan") String name,
            @Param("phone") String phone,
            @Param("status") String status);

    List<RepayManageVO> selectAll();

    Integer countByRepayMgr(RepayManage repayManage);
}
