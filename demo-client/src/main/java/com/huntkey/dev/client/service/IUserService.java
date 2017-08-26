package com.huntkey.dev.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yexin on 2017/8/25.
 */
@FeignClient("demo-provide")
public interface IUserService {

    @RequestMapping(value="/user/{something}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("something") String something);
}
