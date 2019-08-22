package com.mywork.sc.service;

public interface ICartService {

    public abstract String addGoodsToCart(String skuProperties,Integer buyNum,Float express,Float salesPrice,Integer cartId,Integer goodsId);
}
