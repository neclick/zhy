package com.zhy.fund.service.impl;

import com.zhy.fund.dao.UserMapper;
import com.zhy.fund.entity.User;
import com.zhy.fund.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User userLogin(String userNo, String userPass) {

        return userMapper.userLogin(userNo,userPass);
    }

    @Override
    public int register(String userNo,String userNm, String userTel, String userIdcard, String userPass) {
        return userMapper.register(userNo,userNm,userTel,userIdcard,userPass);
    }

    @Override
    public ArrayList<User> findAllUserInfo() {
        return userMapper.findAllUserInfo();
    }
}
