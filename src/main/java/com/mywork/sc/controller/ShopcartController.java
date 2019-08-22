package com.mywork.sc.controller;

import com.mywork.sc.entity.ShopcartBean;
import com.mywork.sc.service.IShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/shopcart")
public class ShopcartController {

    @Autowired
    IShopcartService shopcartService;

    public IShopcartService getShopcartService() {
        return shopcartService;
    }

    public void setShopcartService(IShopcartService shopcartService) {
        this.shopcartService = shopcartService;
    }

    @RequestMapping(value = "/showShopcart/{cartId}")
    public ModelAndView showShopcart(@PathVariable(value = "cartId")Integer cartId){

        List<ShopcartBean> shopcartInfoList = shopcartService.shopcartAll(cartId);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("shopcartInfoList",shopcartInfoList);

        modelAndView.setViewName("shopcart");

        System.out.println(shopcartInfoList);
        System.out.println(modelAndView);

        return modelAndView;
    }


}
