package com.gxa.internetfinance.service;

import com.gxa.internetfinance.pojo.vo.RepayManageQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayRecordQueryVO;
import com.gxa.internetfinance.pojo.vo.RepayRecordVO;

import java.util.List;

/**
 * @author Zhang F
 * @version 1.0
 * @date 2021/6/8 19:46
 */
public interface RepayRecordService {

    List<RepayRecordVO> selectBypage(Integer page, Integer size, RepayRecordQueryVO repayRecordQueryVO);

//    List<RepayManageVO> list(Integer page, Integer size, RepayManageQueryVO repayManageQueryVO);
    List<RepayRecordVO> selectAll();

}
