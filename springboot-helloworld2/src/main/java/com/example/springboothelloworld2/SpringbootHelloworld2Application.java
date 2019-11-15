package com.example.springboothelloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringbootHelloworld2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworld2Application.class, args);
    }

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        return "helloworld";
    }
}
