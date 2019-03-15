package com.zhy.fund.entity;

import java.util.Date;

public class Product {
    private Integer productId;

    private String fundCode;

    private String productNm;

    private String productType;

    private Double productIncom;

    private Double productRate;

    private Date productDt;

    private String fundManager;

    private String creatDt;

    private String totalShare;

    private String circulatShare;

    private Double finalPrice;

    private Date time;

    private Double dayGrowRate;

    private Double weekGrowRate;

    private Double monthGrowRate;

    private Double tatalNet;

    private Double newNet;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getProductNm() {
        return productNm;
    }

    public void setProductNm(String productNm) {
        this.productNm = productNm == null ? null : productNm.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public Double getProductIncom() {
        return productIncom;
    }

    public void setProductIncom(Double productIncom) {
        this.productIncom = productIncom;
    }

    public Double getProductRate() {
        return productRate;
    }

    public void setProductRate(Double productRate) {
        this.productRate = productRate;
    }

    public Date getProductDt() {
        return productDt;
    }

    public void setProductDt(Date productDt) {
        this.productDt = productDt;
    }

    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager == null ? null : fundManager.trim();
    }

    public String getCreatDt() {
        return creatDt;
    }

    public void setCreatDt(String creatDt) {
        this.creatDt = creatDt == null ? null : creatDt.trim();
    }

    public String getTotalShare() {
        return totalShare;
    }

    public void setTotalShare(String totalShare) {
        this.totalShare = totalShare == null ? null : totalShare.trim();
    }

    public String getCirculatShare() {
        return circulatShare;
    }

    public void setCirculatShare(String circulatShare) {
        this.circulatShare = circulatShare == null ? null : circulatShare.trim();
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getDayGrowRate() {
        return dayGrowRate;
    }

    public void setDayGrowRate(Double dayGrowRate) {
        this.dayGrowRate = dayGrowRate;
    }

    public Double getWeekGrowRate() {
        return weekGrowRate;
    }

    public void setWeekGrowRate(Double weekGrowRate) {
        this.weekGrowRate = weekGrowRate;
    }

    public Double getMonthGrowRate() {
        return monthGrowRate;
    }

    public void setMonthGrowRate(Double monthGrowRate) {
        this.monthGrowRate = monthGrowRate;
    }

    public Double getTatalNet() {
        return tatalNet;
    }

    public void setTatalNet(Double tatalNet) {
        this.tatalNet = tatalNet;
    }

    public Double getNewNet() {
        return newNet;
    }

    public void setNewNet(Double newNet) {
        this.newNet = newNet;
    }
}