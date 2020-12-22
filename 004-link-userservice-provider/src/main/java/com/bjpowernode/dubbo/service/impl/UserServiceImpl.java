package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setUsername("Chloe Gan");
        return user;
    }

    @Override
    public Integer queryUserCount() {
        return 52;
    }
}
