package com.zhy.fund.entity;

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
        this.userNm = userNm == null ? null : userNm.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getProductNm() {
        return productNm;
    }

    public void setProductNm(String productNm) {
        this.productNm = productNm == null ? null : productNm.trim();
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
}