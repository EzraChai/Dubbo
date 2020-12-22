package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {

        //模拟
        User user = new User();
        user.setUsername("Chloe Gan");
        user.setId(1001);
        user.setAge(15);
        return user;
    }
}
