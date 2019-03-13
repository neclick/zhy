package com.zhy.fund.controller;

import com.zhy.fund.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhy.fund.service.AdminService;

import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")
    public String login(String adminNm,String adminNo,String adminPass){
        if(adminService.login(adminNm, adminNo,adminPass)!=null){
            return "redirect:findAllAdminInfo";
        }else{
            return "login";
        }
    }
    @RequestMapping("addAdmin")
    public String addAdmin(String adminNm, String adminNo, String adminPass){
        if(adminService.addAdmin(adminNm, adminNo, adminPass)>0){
            return "findAllAdminInfo";
        }else{
            return "findAllAdminInfo";
        }
    }
    @RequestMapping("findAllAdminInfo")
    public String findAllAdminInfo(Map<String,Object> map){
        return "main";
    }

}
