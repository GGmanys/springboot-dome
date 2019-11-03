package com.ggman.springboot.controller;

import com.ggman.springboot.bean.Info;
import com.ggman.springboot.bean.User;
import com.ggman.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    /**
     * 登录
     */
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public Info login(User user){
        return  userService.login(user);
    }
}
