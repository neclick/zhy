package com.zhy.fund.service.impl;

import com.zhy.fund.dao.UserMapper;
import com.zhy.fund.entity.User;
import com.zhy.fund.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public User findUserInfo(Integer userId) {
        return userMapper.findUserInfo(userId);
    }

    @Override
    public User selectByNo(String userNo) {
        return userMapper.selectByNo(userNo);
    }



}
