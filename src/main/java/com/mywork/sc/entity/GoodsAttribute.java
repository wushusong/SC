package com.mywork.sc.entity;

import java.util.Date;

public class GoodsAttribute {
    private Integer goodsAttrNameValueId;

    private Integer goodsId;

    private Integer attrNameId;

    private Integer attrValueId;

    private Date attrNameDate;

    public Integer getGoodsAttrNameValueId() {
        return goodsAttrNameValueId;
    }

    public void setGoodsAttrNameValueId(Integer goodsAttrNameValueId) {
        this.goodsAttrNameValueId = goodsAttrNameValueId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAttrNameId() {
        return attrNameId;
    }

    public void setAttrNameId(Integer attrNameId) {
        this.attrNameId = attrNameId;
    }

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Date getAttrNameDate() {
        return attrNameDate;
    }

    public void setAttrNameDate(Date attrNameDate) {
        this.attrNameDate = attrNameDate;
    }
}