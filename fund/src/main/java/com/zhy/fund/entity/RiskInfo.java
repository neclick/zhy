package com.zhy.fund.entity;

public class RiskInfo {
    private Integer riskId;

    private String riskTopic;

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public String getRiskTopic() {
        return riskTopic;
    }

    public void setRiskTopic(String riskTopic) {
        this.riskTopic = riskTopic == null ? null : riskTopic.trim();
    }
}