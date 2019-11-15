package com.example.springboot_elasticsearch.service;

import com.example.springboot_elasticsearch.dao.TribuneRepository;
import com.example.springboot_elasticsearch.entity.Tribune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TribuneServiceImpl implements TribuneService{

    @Autowired
    private TribuneRepository tribuneRepository;

    @Override
    public Tribune save(Tribune tribune) {
        return tribuneRepository.save(tribune);
    }

    @Override
    public Page<Tribune> findByContent(String content, PageRequest pageRequest) {
        return tribuneRepository.findByContent(content,pageRequest);
    }
}
