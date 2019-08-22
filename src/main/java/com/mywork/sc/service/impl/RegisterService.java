package com.mywork.sc.service.impl;

import com.mywork.sc.entity.Cart;
import com.mywork.sc.entity.CartInfo;
import com.mywork.sc.entity.Users;
import com.mywork.sc.mapper.RegisterMapper;
import com.mywork.sc.service.IRegisterService;
import org.omg.CORBA.StringHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements IRegisterService {

    @Autowired
    RegisterMapper registerMapper;

    public RegisterMapper getRegisterMapper() {
        return registerMapper;
    }

    public void setRegisterMapper(RegisterMapper registerMapper) {
        this.registerMapper = registerMapper;
    }

    @Override
    public String register(Users users) {
        Integer key1 = registerMapper.registerUser(users);

        String result = "未知错误";

        if(key1>0){
            Integer lastUserId = registerMapper.getLastUserId();
            Cart cart = new Cart(lastUserId, (float) 0.0,0);

            Integer key2 = registerMapper.addCart(cart);

            Integer cartId = registerMapper.getLastCartId();

            CartInfo cartInfo = new CartInfo();

            cartInfo.setCartId(cartId);

            Integer key3 = registerMapper.addCartInfo(cartInfo);

            if(key3>0){
                result = "注册成功";
            }else {
                result = "服务器内部错误";
            }
        }else{
                result = "用户已存在";
        }

        return result;
    }
}
