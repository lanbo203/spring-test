package com.huntkey.dev.ribbon.controller;

import com.huntkey.dev.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yexin on 2017/8/23.
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("ribbon hi funtion run ..............");
        return helloService.hiService(name);
    }
}
