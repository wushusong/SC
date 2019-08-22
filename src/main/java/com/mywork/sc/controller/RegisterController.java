package com.mywork.sc.controller;

import com.mywork.sc.entity.Users;
import com.mywork.sc.service.IRegisterService;
import com.mywork.sc.service.impl.RegisterService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    IRegisterService registerService;

    public IRegisterService getRegisterService() {
        return registerService;
    }

    public void setRegisterService(IRegisterService registerService) {
        this.registerService = registerService;
    }

    @RequestMapping(value = "/emailOrMobel")
    public ModelAndView register(Users users){

        String result = registerService.register(users);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("result",result);
        modelAndView.setViewName("register");

        return modelAndView;
    }
}
