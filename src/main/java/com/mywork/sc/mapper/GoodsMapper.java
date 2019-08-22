package com.mywork.sc.mapper;

import com.mywork.sc.entity.Goods;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {

    public abstract Goods goodsAttributeValue(@Param(value = "goodsId") Integer goodsId);
}
