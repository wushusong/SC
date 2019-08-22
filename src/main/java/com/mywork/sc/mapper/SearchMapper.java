package com.mywork.sc.mapper;

import com.mywork.sc.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchMapper {

    public abstract List<Goods> getGoodsByKey(@Param(value = "key") String key);

    public abstract List<Goods> getGoodsByLabel(@Param(value = "keyLabel") String keyLabel);
}
