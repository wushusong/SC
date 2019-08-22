package com.mywork.sc.mapper;

import com.mywork.sc.entity.Users;
import org.springframework.stereotype.Component;

public interface UsersMapper {

    public Users getUserByUname(Users users);

}
