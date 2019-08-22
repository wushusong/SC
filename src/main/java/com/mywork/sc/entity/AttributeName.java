package com.mywork.sc.entity;

import java.util.Date;
import java.util.List;

public class AttributeName {
    private Integer attrNameId;

    private Integer cid;

    private String attrName;

    private Boolean isSalesAttr;

    private Boolean isRequired;

    private Date attrNameDate;

    private List<AttributeValue> attributeValueList;


    public Integer getAttrNameId() {
        return attrNameId;
    }

    public void setAttrNameId(Integer attrNameId) {
        this.attrNameId = attrNameId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Boolean getSalesAttr() {
        return isSalesAttr;
    }

    public void setSalesAttr(Boolean salesAttr) {
        isSalesAttr = salesAttr;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public Date getAttrNameDate() {
        return attrNameDate;
    }

    public void setAttrNameDate(Date attrNameDate) {
        this.attrNameDate = attrNameDate;
    }

    public List<AttributeValue> getAttributeValueList() {
        return attributeValueList;
    }

    public void setAttributeValueList(List<AttributeValue> attributeValueList) {
        this.attributeValueList = attributeValueList;
    }

    @Override
    public String toString() {
        return "AttributeName{" +
                "attrNameId=" + attrNameId +
                ", cid=" + cid +
                ", attrName='" + attrName + '\'' +
                ", isSalesAttr=" + isSalesAttr +
                ", isRequired=" + isRequired +
                ", attrNameDate=" + attrNameDate +
                ", attributeValueList=" + attributeValueList +
                '}';
    }
}