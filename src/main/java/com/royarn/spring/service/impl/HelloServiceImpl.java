package com.royarn.spring.service.impl;

import com.royarn.spring.annotation.SFService;
import com.royarn.spring.service.HelloService;

/**
 * Description:
 *
 * @author dell
 * @date 2018-10-12
 */
@SFService
public class HelloServiceImpl implements HelloService {

    public String sayHello(String str) {
        return "spring bean is finish";
    }
}
