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
            default:
                return "index";
        }
    }
}
