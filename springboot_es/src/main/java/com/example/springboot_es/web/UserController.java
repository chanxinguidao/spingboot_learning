package com.example.springboot_es.web;
import	java.util.regex.Pattern;


import com.example.springboot_es.UserService;
import com.example.springboot_es.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        user.setRemark("四道口附近哈哈ask回复");
        user.setUserName("撒旦"+Math.random());
        userService.save(user);
        return "success";
    }

    @GetMapping("/find/{name}")
    public List<User> findUser(@PathVariable String name){
        return userService.findUser(name);
    }

}
