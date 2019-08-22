package com.mywork.sc.entity;

import java.util.Date;
import java.util.List;

public class ShopcartBean {

    private String goodsName;
    private Float salesPrice;
    private Integer cartId;
    private Integer skuId;
    private Integer buyNum;
    private Integer goodsId;
    private Float price;
    private Integer num;
    private String skuName;
    private String skuProperties;

    private List<AttributeName> attributeNameList;

    @Override
    public String toString() {
        return "ShopcartBean{" +
                "goodsName='" + goodsName + '\'' +
                ", salesPrice=" + salesPrice +
                ", cartId=" + cartId +
                ", skuId=" + skuId +
                ", buyNum=" + buyNum +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", num=" + num +
                ", skuName='" + skuName + '\'' +
                ", skuProperties='" + skuProperties + '\'' +
                ", attributeNameList=" + attributeNameList +
                '}';
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
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
