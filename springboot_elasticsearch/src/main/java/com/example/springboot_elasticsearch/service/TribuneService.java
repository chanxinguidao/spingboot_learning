package com.example.springboot_elasticsearch.service;

import com.example.springboot_elasticsearch.entity.Tribune;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface TribuneService {

    Tribune save(Tribune tribune);

    Page<Tribune> findByContent(String content , PageRequest pageRequest);
}
