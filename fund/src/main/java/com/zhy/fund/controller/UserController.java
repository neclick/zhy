package com.zhy.fund.controller;

import com.zhy.fund.entity.User;
import com.zhy.fund.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("userLogin")
    public  String userLogin(@RequestParam("userNo") String userNo, @RequestParam("userPass") String userPass){
        if(userService.userLogin(userNo, userPass)!=null){
            /*map.put("userno",userNo);*/
            return "index";
        }else{
            return "index";
        }
    }
    @RequestMapping("register")
    public String register(@RequestParam("userNo") String userNo,@RequestParam("userNm") String userNm,@RequestParam("userTel")String userTel ,@RequestParam("userIdcard") String userIdcard,@RequestParam("userPass") String userPass){
        if(userService.register(userNo,userNm, userTel, userIdcard,userPass)>0){
            return "index";
        }else{
            return "index";
        }
    }
    @RequestMapping("userDetail")
    public String findAllUserInfo(Map<String,Object> map){
        List<User> uslist=userService.findAllUserInfo();
        System.out.println(uslist);
        map.put("uslist",uslist);
        return "admin/user-basic";
    }

}
