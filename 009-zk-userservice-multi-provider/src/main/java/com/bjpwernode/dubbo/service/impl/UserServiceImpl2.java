package com.bjpwernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setUsername(name + "--- 2 ");
        return user;
    }
}
