package com.zhy.fund.controller;

import com.alipay.api.domain.BankCardInfo;
import com.zhy.fund.entity.User;
import com.zhy.fund.service.UserService;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.pkcs11.wrapper.Constants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("userLogin")
    public  String userLogin(@RequestParam("userNo") String userNo, @RequestParam("userPass") String userPass,HttpServletRequest request){
        if(userService.userLogin(userNo, userPass)!=null){
            /*map.put("userno",userNo);*/
            User users=userService.selectByNo(userNo);
/*            String uname=users.getUserNm();
            Integer uid=users.getUserId();
            String usertel=users.getUserTel();*/

            HttpSession session=request.getSession();
/*            session.setAttribute("uid",uid);
            session.setAttribute("uname",uname);*/
            session.setAttribute("users",users);
            return "index2";
        }else{
            return "index";
        }
    }
    @RequestMapping("register")
    public String register(@RequestParam("userNo") String userNo,@RequestParam("userNm") String userNm,@RequestParam("userTel")String userTel ,@RequestParam("userIdcard") String userIdcard,@RequestParam("userPass") String userPass){
        if(userService.register(userNo,userNm, userTel, userIdcard,userPass)>0){
            return "index";
        }else{
            return "index";
        }
    }
    @RequestMapping("userDetail")
    public String findAllUserInfo(Map<String,Object> map){
        List<User> uslist=userService.findAllUserInfo();
        System.out.println(uslist);
        map.put("uslist",uslist);
        return "admin/user-basic";
    }

    @RequestMapping("findUserInfo")
    public String findUserInfo(@RequestParam("userId") String userId, Map<String,Object> map){
        int uId=Integer.parseInt(userId);
        User ulist=userService.findUserInfo(uId);
        map.put("list",ulist);
        System.out.println(ulist);
        return "account";
    }

    @RequestMapping("insertRiskType")
    public String insertRiskType(@RequestParam("userId") String userId, @RequestParam("riskType") String riskType){
        if(userService.insertRiskType(riskType)>0){
            return "index";
        }else{
            return "index";
        }
    }

}
