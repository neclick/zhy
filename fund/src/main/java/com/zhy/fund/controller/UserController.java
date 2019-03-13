package com.zhy.fund.controller;

import com.zhy.fund.dao.UserMapper;
import com.zhy.fund.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("userLogin")
    public  String userLogin(String userNo,String userPass){
        if(userService.userLogin(userNo, userPass)!=null){
            return "index";
        }else{
            return "login";
        }
    }
    @RequestMapping("register")
    public String register(String userNo,String userTel ,String userIdcard,String userPass){
        if(userService.register(userNo, userTel, userIdcard,userPass)>0){
            return "login";
        }else{
            return "register";
        }
    }


}
