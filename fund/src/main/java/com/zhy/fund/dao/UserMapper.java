package com.zhy.fund.dao;

import com.zhy.fund.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public User userLogin(String userNo, String userPass);

    int register(String userNo, String userTel, String userIdcard, String userPass);
}