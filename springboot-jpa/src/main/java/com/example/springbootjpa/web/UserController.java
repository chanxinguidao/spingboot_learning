package com.example.springbootjpa.web;


import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @GetMapping("/save")
    public String save(){
        User user = new User();
        user.setName("zhansgan");
        user.setAge(18);
        userService.saveUser(user);
        return "haolo";
    }

    @GetMapping("/list")
    public String list(ModelMap map){
        map.addAttribute("userList",userService.findUserList());
        return "user";
    }
}
