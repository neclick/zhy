package com.zhy.fund.entity;

import java.util.Date;

public class Order {

    private Integer orderId;

    private String userNm;

    private String userTel;

    private String productNm;

    private Double amount;

    private Double cost;

    private Double actAmount;

    private String buyTime;

    private Date sellTime;

    private Double income;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getProductNm() {
        return productNm;
    }

    public void setProductNm(String productNm) {
        this.productNm = productNm;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getActAmount() {
        return actAmount;
    }

    public void setActAmount(Double actAmount) {
        this.actAmount = actAmount;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public Date getSellTime() {
        return sellTime;
    }

    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }



}