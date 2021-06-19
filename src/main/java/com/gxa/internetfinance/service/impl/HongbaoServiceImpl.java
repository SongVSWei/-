package com.gxa.internetfinance.service.impl;

import com.gxa.internetfinance.mapper.HongbaoMapper;
import com.gxa.internetfinance.pojo.po.Hongbao;
import com.gxa.internetfinance.service.HongbaoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(rollbackFor = Throwable.class)
@Service("hongbaoService")
public class HongbaoServiceImpl implements HongbaoService {
    @Resource
    HongbaoMapper hongbaoMapper=null;
    @Override
    public Integer register(Hongbao hongbao) {
        Integer insert = hongbaoMapper.insert(hongbao);
        return insert;
    }

    @Override
    public List<Hongbao> pageCondition(Integer page, Integer size, String name, String type) {
        List<Hongbao> hongbaos = hongbaoMapper.pageCondition((page - 1), size, name, type);
        return hongbaos;
    }

    /**
     *
     * @param current 当前页
     * @param limit   每页显示的数量
     * @param experienceVO 条件查询封装的对象
     * @param condition 状态
     * @return
     */
   /* @Override
    public List<ExperienceVO> pageCondition(Integer current, Integer limit, ExperienceVO experienceVO, String condition) {
        String name = experienceVO == null ? null : experienceVO.getName();
        String userName = experienceVO == null ? null : experienceVO.getUserName();
        String userPhone = experienceVO == null ? null : experienceVO.getUserPhone();
        String status = experienceVO == null ? null : experienceVO.getStatus();
        if (status == null || status.contains("全部"))
            status = null;
        List<ExperienceVO> list = experirenceMapper.pageCondition((current - 1) * limit, limit,
                name, userName, userPhone, status,condition);
//        list中没有担保信息，所以还需要查询对应的担保信息
       *//* List<BorrowGuarantee> borrowGuarantees = borrowGuaranteeMapper.selectByExample(null);
        for (ExperienceVO borrowInfoVO : list) {
            for (BorrowGuarantee borrowGuarantee : borrowGuarantees) {
                if (borrowInfoVO.getId().equals(borrowGuarantee.getBaseInfoId())) {
                    borrowInfoVO.setGuarantee(borrowGuarantee);
                }
            }
        }*//*
        return list;
    }*/
}
