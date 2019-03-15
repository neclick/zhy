package com.zhy.fund.dao;

import com.zhy.fund.entity.RiskInfo;

import java.util.ArrayList;

public interface RiskInfoMapper {
    int deleteByPrimaryKey(Integer riskId);

    int insert(RiskInfo record);

    int insertSelective(RiskInfo record);

    RiskInfo selectByPrimaryKey(Integer riskId);

    int updateByPrimaryKeySelective(RiskInfo record);

    int updateByPrimaryKey(RiskInfo record);

    ArrayList<RiskInfo> findAllRiskInfo();
}