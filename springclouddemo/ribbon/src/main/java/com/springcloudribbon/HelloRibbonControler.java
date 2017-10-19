package com.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WIN on 2017/10/18.
 */
@RestController
public class HelloRibbonControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hello(@RequestParam String name){
        return helloService.hiService(name);
    }
}