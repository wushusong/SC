package com.mywork.sc.controller;

import com.mywork.sc.entity.Goods;
import com.mywork.sc.service.ISearchGoodsService;
import com.mywork.sc.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    ISearchGoodsService iSearchGoodsService;

    public ISearchGoodsService getiSearchGoodsService() {
        return iSearchGoodsService;
    }

    public void setiSearchGoodsService(ISearchGoodsService iSearchGoodsService) {
        this.iSearchGoodsService = iSearchGoodsService;
    }

    @RequestMapping(value = "/searchByKey")
    public ModelAndView search(@RequestParam(value = "key",defaultValue = "") String key,@RequestParam(value = "currentPage",defaultValue = "1") int currentPage){

        PageBean<Goods> pageBean = iSearchGoodsService.searchGoods(key, currentPage);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("pageBean",pageBean);
        modelAndView.setViewName("search");

        System.out.println(pageBean);

        return modelAndView;
    }
}
