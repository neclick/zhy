package com.zhy.fund.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zhy.fund.util.AlipayConfig;
import com.zhy.fund.util.JiJinUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

   @GetMapping("api_ZhaiQuan")
    @ResponseBody
    public Object getZhaiQuan(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest3();
        System.out.println(obj.toString());
        return obj;
    }

    @GetMapping("api_Close")
    @ResponseBody
    public Object getClose(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest5();
        System.out.println(obj.toString());
        return obj;
    }

    @GetMapping("api_Lof")
    @ResponseBody
    public Object getLof(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest7();
        System.out.println(obj.toString());
        return obj;
    }

    @GetMapping("api_QuanBu")
    @ResponseBody
    public Object getQuanBu(Map<String,Object> map){
        Object obj=JiJinUtil.getRequest1();
        System.out.println(obj.toString());
        return obj;
    }
}
