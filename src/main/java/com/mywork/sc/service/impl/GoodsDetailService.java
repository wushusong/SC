package com.mywork.sc.service.impl;

import com.mywork.sc.entity.Goods;
import com.mywork.sc.mapper.GoodsMapper;
import com.mywork.sc.service.IGoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsDetailService implements IGoodsDetailService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Goods goodsDetail(Integer goodsId) {


        Goods goods = goodsMapper.goodsAttributeValue(goodsId);

        System.out.println("sercice02"+goods);

        return goods;
    }
}
