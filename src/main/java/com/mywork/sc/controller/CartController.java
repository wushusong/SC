package com.mywork.sc.controller;


import com.mywork.sc.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/cart")
public class CartController {


    @Autowired
    ICartService cartService;

    @RequestMapping(value = "/addGoodsToCart")
    @ResponseBody
    public String addGoodsToCart(String skuProperties,Integer buyNum,String express,String salesPrice,Integer cartId,Integer goodsId){
        System.out.println("cart01:"+skuProperties+"*"+buyNum +"*"+express+"*"+salesPrice+"*"+cartId+"*"+goodsId);

        Float expr = Float.parseFloat(express);
        Float sp = Float.parseFloat(salesPrice);

        String key = cartService.addGoodsToCart(skuProperties, buyNum, expr, sp, cartId,goodsId);
        System.out.println(key);
        return key;
    }
}
