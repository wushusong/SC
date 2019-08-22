package com.mywork.sc.entity;

import java.util.List;

public class Cart {
    private Integer cartId;

    private Integer userId;

    private Float totalPrice;

    private Integer totalNum;

    private List<CartInfo> cartInfoList;

    public Cart() {
    }

    public Cart(Integer userId, Float totalPrice, Integer totalNum) {
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.totalNum = totalNum;
    }

    public Cart(Integer cartId, Integer userId, Float totalPrice, Integer totalNum, List<CartInfo> cartInfoList) {
        this.cartId = cartId;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.totalNum = totalNum;
        this.cartInfoList = cartInfoList;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public List<CartInfo> getCartInfoList() {
        return cartInfoList;
    }

    public void setCartInfoList(List<CartInfo> cartInfoList) {
        this.cartInfoList = cartInfoList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", totalPrice=" + totalPrice +
                ", totalNum=" + totalNum +
                ", cartInfoList=" + cartInfoList +
                '}';
    }
}