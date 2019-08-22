package com.mywork.sc.service.impl;

import com.mywork.sc.mapper.AddCarMapper;
import com.mywork.sc.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService {

    @Autowired
    AddCarMapper addCarMapper;

    public AddCarMapper getAddCarMapper() {
        return addCarMapper;
    }

    public void setAddCarMapper(AddCarMapper addCarMapper) {
        this.addCarMapper = addCarMapper;
    }

    @Override
    public String addGoodsToCart(String skuProperties, Integer buyNum, Float express, Float salesPrice, Integer cartId,Integer goodsId) {

        Integer skuId = addCarMapper.getSkuId(skuProperties,goodsId);

        Float totalPrice = salesPrice*buyNum + express;

        Integer key1 = addCarMapper.addCart(totalPrice, buyNum, cartId);

        Integer key2 = addCarMapper.addCartInfo(cartId, skuId, buyNum);

        if(key1>0 && key2>0){
            return "1";
        }

        return "0";
    }
}
