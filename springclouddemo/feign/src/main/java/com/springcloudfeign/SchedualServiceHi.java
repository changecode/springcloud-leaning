package com.springcloudfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WIN on 2017/10/18.
 */
@FeignClient(value = "client-test")
@Component
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

/* 断路器的使用
1、SchedualServiceHi接口的注解中加上fallback的指定类就行
2、SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
*@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}*/
