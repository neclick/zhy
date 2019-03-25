package com.zhy.fund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("web")
    public String yemian(String name){
        switch (name){
            case "equity":
                return "equity";
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
                return "account";
            case "service":
                return "service";
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
            case "alipay":
                return "alipay";
            default:
                return "index";
        }
    }
}
