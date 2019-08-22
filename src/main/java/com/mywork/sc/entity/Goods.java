package com.mywork.sc.entity;

import java.util.Date;
import java.util.List;

public class Goods {
    private Integer goodsId;

    private Integer cid;

    private Integer brandId;

    private String goodsName;

    private String keywords;

    private Double marketPrice;

    private Double salesPrice;

    private Boolean isSales;

    private Boolean isNew;

    private Boolean isHot;

    private Boolean isShow;

    private Boolean isDelete;

    private String thumbImg;

    private String goodsImg;

    private Integer num;

    private String skuProperties;

    private List<AttributeName> attributeNameList;


    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", cid=" + cid +
                ", brandId=" + brandId +
                ", goodsName='" + goodsName + '\'' +
                ", keywords='" + keywords + '\'' +
                ", marketPrice=" + marketPrice +
                ", salesPrice=" + salesPrice +
                ", isSales=" + isSales +
                ", isNew=" + isNew +
                ", isHot=" + isHot +
                ", isShow=" + isShow +
                ", isDelete=" + isDelete +
                ", thumbImg='" + thumbImg + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", num=" + num +
                ", skuProperties='" + skuProperties + '\'' +
                ", attributeNameList=" + attributeNameList +
                '}';
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Boolean getSales() {
        return isSales;
    }

    public void setSales(Boolean sales) {
        isSales = sales;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getHot() {
        return isHot;
    }

    public void setHot(Boolean hot) {
        isHot = hot;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public List<AttributeName> getAttributeNameList() {
        return attributeNameList;
    }

    public void setAttributeNameList(List<AttributeName> attributeNameList) {
        this.attributeNameList = attributeNameList;
    }
}