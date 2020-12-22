package com.bjpowernode.dubbo.web;

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

    @RequestMapping("/userDetail")
    public String userDetail(Model model,Integer id){
        User user = userService.queryUserById(id);

        Integer allUserCount = userService.queryUserCount();

        model.addAttribute("user" , user);
        model.addAttribute("allUserCount", allUserCount);

        return "userDetail";
    }

}
