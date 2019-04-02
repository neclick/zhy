package com.zhy.fund.controller;

import com.zhy.fund.interceptor.SessionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @GetMapping("web")
    public String yemian(String name, HttpSession session, HttpServletRequest request, HttpServletResponse response){

        switch (name){
            case "equity":
                if (session.getAttribute("users")!=null) {
                    return "equity";
                }else {
                    request.setAttribute("msg", "请先登录系统！");
                    return "index";
                }
            case "about":
                return "about";
            case "index01":
                return "admin/index";
            case "new":
                return "new";
            case "contact":
                return "contact";
            case "detail":
                return "detail";
            case "funds":
                return "funds";
            case "risk":
                return "risk";
            case "managers":
                return "managers";
            case "account":
                if (session.getAttribute("users")!=null) {
                    return "account";
                }else {
                    request.setAttribute("msg", "请先登录系统！");
                   return "index";
                }
            case "service":
                if (session.getAttribute("users")!=null) {
                    return "service";
                }else {
                    request.setAttribute("msg", "请先登录系统！");
                    return "index";
                }
            case "adlogin":
                return "admin/page-login";
            case "ch-flot":
                return "admin/ch-flot";
            case "charts-flot":
                return "admin/charts-flot";
            case "adminDetail":
                return "admin/page-admin";
            case "riskDetail":
                return "admin/risk-topic";
            case "userDetail":
                return "admin/user-basic";
            case "userDetail01":
                return "admin/user-data";
            case "order":
                return "admin/order";
            case "index":
                return "index";
            case "index2":
                return "index2";
            case "alipay":
                return "alipay";
            case "zhuxiao":
                session.removeAttribute("users");
                return "index";
            default:
                return "index";
        }
    }
    @RequestMapping("isinit")
    @ResponseBody
    public String isinit(HttpSession session){
        if(session.getAttribute("users")==null) {
            String uu="请先登录好吗";
            return uu;
        }else{
            return null;
        }
    }
}
