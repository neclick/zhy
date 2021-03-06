package com.zhy.fund.service;

import com.alipay.api.domain.BankCardInfo;
import com.zhy.fund.entity.User;
import java.util.ArrayList;


public interface UserService {
    public User userLogin(String userNo, String userPass);

    int register(String userNo,String userNm, String userTel, String userIdcard, String userPass);

    ArrayList<User> findAllUserInfo();

    User findUserInfo(Integer userId);

    User selectByNo(String userNo);

    int insertRiskType(String riskType);
}
