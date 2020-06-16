package com.xgcd.sso.client1.controller;

import com.xgcd.sso.client1.entity.User;
import com.xgcd.sso.client1.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceI userService;

    @GetMapping("/userinfo/{id}")
    public String getUserById(@PathVariable int id) {
        User user = userService.selectByPrimaryKey(id);
        return user.toString();
    }
}
