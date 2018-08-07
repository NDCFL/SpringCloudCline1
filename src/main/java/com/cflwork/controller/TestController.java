package com.cflwork.controller;

import com.cflwork.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/user/{id}")
    public User likeName(@PathVariable Long id){
        return this.restTemplate.getForObject("http://service-cline/hello/getInfo/"+id, User.class) ;

    }
}
