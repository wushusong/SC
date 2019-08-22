package com.mywork.sc.mapper;

import com.mywork.sc.entity.Cart;
import com.mywork.sc.entity.CartInfo;
import com.mywork.sc.entity.Users;

public interface RegisterMapper {

    public abstract Integer registerUser(Users users);

    public abstract Integer getLastUserId();

    public abstract Integer addCart(Cart cart);

    public abstract Integer getLastCartId();

    public abstract Integer addCartInfo(CartInfo cartInfo);
}
