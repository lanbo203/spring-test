package com.huntkey.dev.client.controller;

import com.huntkey.dev.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yexin on 2017/8/25.
 */
@RestController
@RequestMapping("/user")
//@Api(value = "用户信息维护服务", description = "提供用户信息的新增、修改、删除和查询服务")
public class UserController {


    @Autowired
    IUserService userService;

    @RequestMapping("/say/{something}")
    public String sayHi(@PathVariable("something") String something){
        return  userService.sayHi(something);
    }

}
