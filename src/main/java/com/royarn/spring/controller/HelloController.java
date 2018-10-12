package com.royarn.spring.controller;

import com.royarn.spring.annotation.SFAutowired;
import com.royarn.spring.annotation.SFController;
import com.royarn.spring.service.HelloService;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */
@SFController
public class HelloController {

    @SFAutowired
    private HelloService service;

    public String get() {
        return service.sayHello(null);
    }
}