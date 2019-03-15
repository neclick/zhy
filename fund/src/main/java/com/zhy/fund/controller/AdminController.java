package com.zhy.fund.controller;

import com.zhy.fund.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhy.fund.service.AdminService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")
    public String login(@RequestParam("adminNm") String adminNm,@RequestParam("adminNo") String adminNo,@RequestParam("adminPass") String adminPass){
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
            return "admin/page-admin";
        }
    }
    @RequestMapping("adminDetail")
    public String findAllAdminInfo(Map<String,Object> map){
        List<Admin> adlist=adminService.findAllAdminInfo();
        System.out.println(adlist);
        map.put("adlist",adlist);
        return "admin/page-admin";
    }

    @RequestMapping("adlogin")
    public String adlogin(){
        return "admin/page-login";
    }

}
