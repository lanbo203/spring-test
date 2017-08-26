package com.huntkey.dev.common;

import org.springframework.stereotype.Component;

/**
 * Created by yexin on 2017/8/24.
 */
@Component
public class UserService2 {

    public UserService2(){
        System.out.println("diao yong  userservice222 ......");
    }


    public String say(){
        System.out.println("say-----userservice222.....");
        return "say0-------";
    }

}
