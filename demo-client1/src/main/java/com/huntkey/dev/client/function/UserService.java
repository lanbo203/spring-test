package com.huntkey.dev.client.function;

import org.springframework.stereotype.Component;

/**
 * Created by yexin on 2017/8/24.
 */
@Component
public class UserService {

    public UserService(){
        System.out.println("diao yong  userservice ......");
    }


    public String say(){
        System.out.println("say-----userservice.....");
        return "say0-------";
    }

}
