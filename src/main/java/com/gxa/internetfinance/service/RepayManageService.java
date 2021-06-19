package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.po.RepayManage;
import com.gxa.internetfinance.pojo.vo.BorrowInfoVO;
import com.gxa.internetfinance.pojo.vo.RepayManageQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayManageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 19:46
 */
public interface RepayManageService {

    List<RepayManageVO> selectBypage(Integer page, Integer size, RepayManageQueryVO repayManageQueryVO);

//    List<RepayManageVO> list(Integer page, Integer size, RepayManageQueryVO repayManageQueryVO);
    List<RepayManageVO> selectAll();
    Integer countByRepayMgr(RepayManage repayManage);
}
