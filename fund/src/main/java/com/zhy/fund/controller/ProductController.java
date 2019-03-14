package com.zhy.fund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @GetMapping("psingle")
    public String singlepage(@RequestParam("name") String name,@RequestParam("totalnet") String totalnet){
        System.out.println(name);
        System.out.println(totalnet);
        return "details";
    }
}
