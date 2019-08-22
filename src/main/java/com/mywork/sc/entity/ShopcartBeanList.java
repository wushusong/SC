package com.mywork.sc.entity;

import java.util.List;

public class ShopcartBeanList {

    private Integer cartId;

    private List<ShopcartBean> shopcartBeanList;

    public Integer getCartId() {

        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<ShopcartBean> getShopcartBeanList() {
        return shopcartBeanList;
    }

    public void setShopcartBeanList(List<ShopcartBean> shopcartBeanList) {
        this.shopcartBeanList = shopcartBeanList;
    }

    @Override
    public String toString() {
        return "ShopcartBeanList{" +
                "cartId=" + cartId +
                ", shopcartBeanList=" + shopcartBeanList +
                '}';
    }
}
