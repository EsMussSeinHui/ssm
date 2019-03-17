package com.syh.controller;

import com.syh.model.AyUser;
import com.syh.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: hui
 * @Date: 2019/3/17 10:12
 */
@Controller
@RequestMapping(value = "/user")
public class AyUserController {
    @Resource
    private AyUserService ayUserService;

    @GetMapping("/findAll")
    public String findAll(Model model){
       List<AyUser> ayUserList = ayUserService.findAll();
        for(AyUser ayUser : ayUserList){
            System.out.println("id: " + ayUser.getId());
            System.out.println("name: " + ayUser.getName());
        }
        return "hello";
    }
}
