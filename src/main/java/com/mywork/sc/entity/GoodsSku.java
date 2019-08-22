package com.mywork.sc.entity;

import java.util.Date;

public class GoodsSku {
    private Integer skuId;

    private Integer goodsId;

    private Double price;

    private Short num;

    private String skuName;

    private String skuProperties;

    private Date skuDate;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
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

    public Date getSkuDate() {
        return skuDate;
    }

    public void setSkuDate(Date skuDate) {
        this.skuDate = skuDate;
    }

    @Override
    public String toString() {
        return "GoodsSku{" +
                "skuId=" + skuId +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", num=" + num +
                ", skuName='" + skuName + '\'' +
                ", skuProperties='" + skuProperties + '\'' +
                ", skuDate=" + skuDate +
                '}';
    }
}