package com.mywork.sc.entity;

import java.util.Date;

public class AttributeValue {
    private Integer attrValueId;

    private Integer attrNameId;

    private String attrValue;

    private String valueUnit;

    private Short orderNum;

    private String state;

    private Date attrNameDate;

    private String skuProperties;

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Integer getAttrNameId() {
        return attrNameId;
    }

    public void setAttrNameId(Integer attrNameId) {
        this.attrNameId = attrNameId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAttrNameDate() {
        return attrNameDate;
    }

    public void setAttrNameDate(Date attrNameDate) {
        this.attrNameDate = attrNameDate;
    }

    @Override
    public String toString() {
        return "AttributeValue{" +
                "attrValueId=" + attrValueId +
                ", attrNameId=" + attrNameId +
                ", attrValue='" + attrValue + '\'' +
                ", valueUnit='" + valueUnit + '\'' +
                ", orderNum=" + orderNum +
                ", state='" + state + '\'' +
                ", attrNameDate=" + attrNameDate +
                ", skuProperties='" + skuProperties + '\'' +
                '}';
    }
}