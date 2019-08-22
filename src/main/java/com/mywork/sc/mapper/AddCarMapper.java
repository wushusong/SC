package com.mywork.sc.mapper;

import org.apache.ibatis.annotations.Param;

public interface AddCarMapper {

    public abstract Integer getSkuId(@Param(value = "skuProperties")String skuProperties,@Param(value = "goodsId")Integer goodsId);

    public abstract Integer addCart(@Param(value = "totalPrice") Float totalPrice,@Param(value = "buyNum")Integer buyNum, @Param(value = "cartId")Integer cartId);

    public abstract Integer addCartInfo(@Param(value = "cartId")Integer cartId,@Param(value = "skuId")Integer skuId,@Param(value = "buyNum")Integer buyNum);
}
