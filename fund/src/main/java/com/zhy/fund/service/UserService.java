package com.zhy.fund.service;

import com.zhy.fund.entity.User;

public interface UserService {
    public User userLogin(String userNo, String userPass);

    int register(String userNo, String userTel, String userIdcard, String userPass);
}
