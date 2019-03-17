package com.syh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hui
 * @Date: 2019/3/16 19:44
 */

@Controller
@RequestMapping("/test")
public class SyhTestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
