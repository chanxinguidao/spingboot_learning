package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;


    public void saveUser(User user){
        userRepository.save(user);
    }

    public List<User> findUserList(){
        return userRepository.findAll();
    }

    public void deleteUser(){
        userRepository.deleteById(1);
    }


}
