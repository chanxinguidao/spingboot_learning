package com.example.springboot_elasticsearch.dao;

import com.example.springboot_elasticsearch.entity.Tribune;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TribuneRepository extends ElasticsearchRepository<Tribune,String> {

        Page<Tribune> findByContent(String content, Pageable pageable);
}
