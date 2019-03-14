package com.zhy.fund.controller;

import com.zhy.fund.util.JiJinUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ApiController {
    @GetMapping("api_GuPiao")
    @ResponseBody
    public Object getHuoBi(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest2();
        System.out.println(obj.toString());
        return obj;
    }

   /* @GetMapping("api_ZhaiQuan")
    @ResponseBody
    public Object getZhaiQuan(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest3();
        System.out.println(obj.toString());
        return obj;
    }*/
}
