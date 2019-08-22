package com.mywork.sc.service;

import com.mywork.sc.entity.Goods;
import com.mywork.sc.util.PageBean;

import java.util.List;

public interface ISearchGoodsService {

    public abstract PageBean<Goods> searchGoods(String key, Integer currentPage);

    //public abstract PageBean<Goods> searchGoodsByLabel(String key, Integer currentPage);
}