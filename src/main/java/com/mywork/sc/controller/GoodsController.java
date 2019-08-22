package com.mywork.sc.controller;

import com.mywork.sc.entity.Goods;
import com.mywork.sc.service.IGoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    IGoodsDetailService goodsDetailService;

    @RequestMapping(value = "/goodsDetail/{goodsId}")
    public ModelAndView goodsDetail(@PathVariable(value = "goodsId")Integer goodsId ){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("introduction");

        Goods goods = goodsDetailService.goodsDetail(goodsId);

        modelAndView.addObject("goods",goods);
        System.out.println("c001:"+goods);

        return modelAndView;
    }
}
