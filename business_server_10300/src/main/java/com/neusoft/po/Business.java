package com.neusoft.po;

import java.util.List;

public class Business {
    private Integer businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private Integer orderTypeId;
    private double starPrice;            //起送费
    private double deliveryPrice;        //配送费
    private String remarks;
    private List<Food> foodList;
    public String getBusinessAddress() {
        return businessAddress;
    }
    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }
    public String getBusinessExplain() {
        return businessExplain;
    }
    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }
    public Integer getBusinessId() {
        return businessId;
    }
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }
    public String getBusinessName() {
        return businessName;
    }
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    public String getBusinessImg() {
        return businessImg;
    }
    public void setBusinessImg(String businessImg) {
        this.businessImg = businessImg;
    }
    public Integer getOrderTypeId() {
        return orderTypeId;
    }
    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    public double getStarPrice() {
        return starPrice;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public void setStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }
    public double getDeliveryPrice() {
        return deliveryPrice;
    }
    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public List<Food> getFoodList() {
        return foodList;
    }
    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
