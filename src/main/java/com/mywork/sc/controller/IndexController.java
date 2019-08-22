package com.mywork.sc.controller;

import com.mywork.sc.entity.Category;
import com.mywork.sc.entity.Users;
import com.mywork.sc.service.IIndexCategoryService;
import com.mywork.sc.service.IScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/index")
@SessionAttributes("userInfo")
public class IndexController {

    @Autowired
    IIndexCategoryService iIndexCategoryService;

    @RequestMapping(value = "/showCategaryAll")
    public ModelAndView showCategaryAll() {

        List<Category> categorys = iIndexCategoryService.showCategoryAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("categorys", categorys);
        modelAndView.setViewName("index");

        return modelAndView;

    }

    @Autowired
    public IScService scService;

    public IScService getScService() {
        return scService;
    }

    public void setScService(IScService scService) {
        this.scService = scService;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(Users users) {

        Users userInfo = scService.getUserByUname(users);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("result", userInfo.getResult());

        if (userInfo.getResult().equals("登入成功")) {
            modelAndView.addObject("userInfo", userInfo);

            modelAndView.setViewName("redirect:/index/showCategaryAll");
        } else {

            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}
