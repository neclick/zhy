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
    @RequestMapping("adminDetail")
    public String findAllAdminInfo(Map<String,Object> map){
        List<Admin> adlist=adminService.findAllAdminInfo();
        System.out.println(adlist);
        map.put("adlist",adlist);
        return "admin/page-admin";
    }
    @RequestMapping("addAdmin")
    public String addAdmin(@RequestParam("adminNm") String adminNm,@RequestParam("adminNo") String adminNo,@RequestParam("adminPass") String adminPass){
        if(adminService.addAdmin(adminNm, adminNo, adminPass)>0){
            return "forward:adminDetail";
        }else{
            return "forward:adminDetail";
        }
    }
    @RequestMapping("delAdminInfo")
    public String delUserinfo(@RequestParam("adminId") String adminId) {

        int adId=Integer.parseInt(adminId);
        System.out.println(adminId);
        if (adminService.delAdminInfo(adId) > 0) {
            return "forward:adminDetail";
        } else {
            return "forward:adminDetail";
        }
    }
    @RequestMapping("adlogin")
    public String adlogin(){

        return "admin/page-login";
    }

}
