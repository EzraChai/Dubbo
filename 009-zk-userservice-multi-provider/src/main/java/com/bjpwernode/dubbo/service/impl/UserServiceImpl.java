package com.bjpwernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id, String name) {
        User user = new User();
        user.setUsername(name + "--- 1 ");
        user.setId(id);
        return user;
    }
}
