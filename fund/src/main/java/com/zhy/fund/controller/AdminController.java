package com.zhy.fund.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhy.fund.service.AdminService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")
    public String login(@RequestParam("adminNm") String adminNm,@RequestParam("adminNo") String adminNo,@RequestParam("adminPass") String adminPass){
        System.out.println(adminNm);
        System.out.println(adminNo);
        System.out.println(adminPass);
        if(adminService.login(adminNm,adminNo,adminPass)!=null){
            return "admin/index";
        }else{
            return "admin/page-login";
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

    @RequestMapping("adlogin")
    public String adlogin(){
        return "admin/page-login";
    }

    @RequestMapping("demo")
    public String demo(){
        return "equity";
    }
}
