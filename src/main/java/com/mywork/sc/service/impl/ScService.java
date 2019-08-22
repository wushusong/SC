package com.mywork.sc.service.impl;

import com.mywork.sc.entity.Users;
import com.mywork.sc.mapper.UsersMapper;
import com.mywork.sc.service.IScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScService implements IScService {

    @Autowired
    UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public Users getUserByUname(Users users) {

        Users user = usersMapper.getUserByUname(users);

        System.out.println("service01:"+users);

        System.out.println("sss"+user);

        if(user != null){
            if (user.getUpwd().equals(users.getUpwd())){
                System.out.println("service02");
                user.setResult("登入成功");

            }else {
                System.out.println("service03:");

                user.setResult("密码错误");

            }
        }else {
            user = new Users();
            System.out.println("service04");
            user.setResult("该用户不存在");
            System.out.println("service04:"+user.getResult());

        }
        return user;
    }
}
