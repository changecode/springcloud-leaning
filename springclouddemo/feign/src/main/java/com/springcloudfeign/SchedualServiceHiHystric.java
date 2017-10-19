package com.springcloudfeign;

import org.springframework.stereotype.Component;

/**
 * Created by WIN on 2017/10/18.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}