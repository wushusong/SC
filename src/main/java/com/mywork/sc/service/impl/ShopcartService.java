package com.mywork.sc.service.impl;

import com.mywork.sc.entity.ShopcartBean;
import com.mywork.sc.mapper.ShopcartMapper;
import com.mywork.sc.service.IShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ShopcartService implements IShopcartService {

    @Autowired
    ShopcartMapper shopcartMapper;

    public ShopcartMapper getShopcartMapper() {
        return shopcartMapper;
    }

    public void setShopcartMapper(ShopcartMapper shopcartMapper) {
        this.shopcartMapper = shopcartMapper;
    }

    @Override
    public List<ShopcartBean> shopcartAll(Integer cartId) {

        List<ShopcartBean> shopcartBeanList = shopcartMapper.getShopcartBean(cartId);

        for (ShopcartBean sm:shopcartBeanList){
            String skuProperties = sm.getSkuProperties();

            String[] skup = skuProperties.split(";");

            StringBuilder sb = new StringBuilder("'");

            for(String s:skup){
                sb.append(s+"','");
            }

            sb.replace(sb.length()-3,sb.length()-1,"");

            String s = sb.toString();

            sm.setSkuProperties(s);
        }

        HashMap<String, Object> map = new HashMap<>();

        map.put("list",shopcartBeanList);
        map.put("cartId",cartId);

        List<ShopcartBean> shopcartInfoList = shopcartMapper.getShopcartBean2(map);

        return shopcartInfoList;
    }
}
