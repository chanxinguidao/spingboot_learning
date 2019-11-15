package com.example.springboot_es;

import com.example.springboot_es.dao.UserRepository;
import com.example.springboot_es.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> findUser(String name){
        return userRepository.findByUserName(name);
    }

    public void save(User user){
        userRepository.save(user);
    }
}
