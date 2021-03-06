package com.bjpowernode.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping("/userDetail")
    public String userDetail(Model model , Integer id, String name){
        User user = userService.queryUserById(id,name);

        User user2 = userService2.queryUserById(id,name);

        model.addAttribute("user1" , user);
        model.addAttribute("user2",user2);

        return "userDetail";
    }
}
