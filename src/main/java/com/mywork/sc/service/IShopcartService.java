package com.mywork.sc.service;

import com.mywork.sc.entity.ShopcartBean;

import java.util.List;

public interface IShopcartService {

    public abstract List<ShopcartBean> shopcartAll(Integer cartId);
}
