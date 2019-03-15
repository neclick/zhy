package com.zhy.fund.controller;

import com.zhy.fund.entity.RiskInfo;
import com.zhy.fund.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class RiskController {
    @Autowired
    RiskService riskService;
    @RequestMapping("riskDetail")
        public String findAllRiskInfo(Map<String,Object> map){
            List<RiskInfo> riskInfoList=riskService.findAllRiskInfo();
            map.put("riskInfoList",riskInfoList);
            return "admin/risk-topic";
        }

    }

