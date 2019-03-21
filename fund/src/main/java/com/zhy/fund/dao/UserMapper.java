package com.zhy.fund.dao;

import com.zhy.fund.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByNo(String userNo);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public User userLogin(@Param("userNo") String userNo,@Param("userPass") String userPass);

    int register(@Param("userNo") String userNo,@Param("userNm") String userNm,@Param("userTel") String userTel,@Param("userIdcard") String userIdcard,@Param("userPass") String userPass);

    ArrayList<User> findAllUserInfo();

    User findUserInfo(@Param("userId") Integer userId);
}