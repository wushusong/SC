package com.mywork.sc.mapper;

import com.mywork.sc.entity.ShopcartBean;
import com.mywork.sc.entity.ShopcartBeanList;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface ShopcartMapper {

    public abstract List<ShopcartBean> getShopcartBean(@Param(value = "cartId")Integer cartId);

    public abstract List<ShopcartBean> getShopcartBean2(HashMap map);
}
