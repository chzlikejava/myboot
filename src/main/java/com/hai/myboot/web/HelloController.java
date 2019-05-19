package com.hai.myboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myboot
 * @description: spring例子hello
 * @author: chen hai zhu
 * @create: 2019-05-19 09:04
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello,world");
        return "hello,spring boot";
    }
}
