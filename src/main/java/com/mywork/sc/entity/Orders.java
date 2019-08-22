package com.mywork.sc.entity;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer userId;

    private Integer osId;

    private Integer addressId;

    private Float orderAmount;

    private Float orderDiscount;

    private Date bestTime;

    private String consignee;

    private String mobile;

    private String shipWay;

    private String shippingName;

    private String payName;

    private Float giftMoney;

    private Date addTime;

    private Date sendTime;

    private Date confirmTime;

    private Date payTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOsId() {
        return osId;
    }

    public void setOsId(Integer osId) {
        this.osId = osId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Float orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Date getBestTime() {
        return bestTime;
    }

    public void setBestTime(Date bestTime) {
        this.bestTime = bestTime;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getShipWay() {
        return shipWay;
    }

    public void setShipWay(String shipWay) {
        this.shipWay = shipWay == null ? null : shipWay.trim();
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public Float getGiftMoney() {
        return giftMoney;
    }

    public void setGiftMoney(Float giftMoney) {
        this.giftMoney = giftMoney;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}