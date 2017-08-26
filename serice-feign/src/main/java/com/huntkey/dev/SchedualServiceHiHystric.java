package com.huntkey.dev;

import org.springframework.stereotype.Component;

/**
 * Created by yexin on 2017/8/23.
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
