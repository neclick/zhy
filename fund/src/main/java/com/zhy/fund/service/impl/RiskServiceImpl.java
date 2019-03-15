package com.zhy.fund.service.impl;

import com.zhy.fund.dao.RiskInfoMapper;
import com.zhy.fund.entity.RiskInfo;
import com.zhy.fund.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RiskServiceImpl implements RiskService {
    @Autowired
    RiskInfoMapper riskInfoMapper;
    @Override
    public ArrayList<RiskInfo> findAllRiskInfo() {
        return riskInfoMapper.findAllRiskInfo() ;
    }

}
