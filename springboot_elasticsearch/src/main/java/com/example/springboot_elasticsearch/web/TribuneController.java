package com.example.springboot_elasticsearch.web;

import com.example.springboot_elasticsearch.entity.Tribune;
import com.example.springboot_elasticsearch.service.TribuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TribuneController {

    @Autowired
    private TribuneService tribuneService;

    @ResponseBody
    @GetMapping("/save")
    public Tribune save(){
        Tribune tribune = new Tribune();
        tribune.setAuthor("张三");
        tribune.setContent("阿斯蒂芬就阿拉斯加地方垃圾十大了解奥斯陆冬季啊连锁酒店拉丝机0跑去文件去啊哇饿就立刻前往");
        tribune.setTitle("标题"+Math.random());
        tribuneService.save(tribune);
        return tribune;
    }

    @ResponseBody
    @GetMapping("/find/{content}/{page}/{size}")
    public Page<Tribune> find(@PathVariable String content,@PathVariable int page ,@PathVariable int size){

        Page<Tribune> tribuneList = tribuneService.findByContent(content, PageRequest.of(page, size));
        return tribuneList;
    }
}
