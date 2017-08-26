package com.example.provide.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yexin on 2017/8/25.
 */
@RestController
@RequestMapping("/user")
public class UserController {



    @RequestMapping(value="{something}",method = RequestMethod.GET)
    public String say(@PathVariable("something") String something){
        return "he say something :"+something;
    }



}
