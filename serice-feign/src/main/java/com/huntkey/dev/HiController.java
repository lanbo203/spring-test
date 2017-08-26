package com.huntkey.dev;

import com.huntkey.dev.config.Ifunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yexin on 2017/8/23.
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Value("${server.port}")
    String port;

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            ConfigApplicationContext.class);

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("---------------调用到sckedualServiceHi-----+port:"+port);

        System.out.println("111111111111111");
        Ifunction function = applicationContext.getBean(Ifunction.class);
        System.out.println(function.say());


        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
