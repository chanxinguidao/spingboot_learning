package com.example.springboot_es.dao;

import com.example.springboot_es.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository  extends ElasticsearchRepository<User,String> {

    List<User> findByUserName(String username);
}
