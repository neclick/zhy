package com.zhy.fund.service;

import com.zhy.fund.entity.Admin;

import java.util.ArrayList;

public interface AdminService {
    public Admin login(String adminNm, String adminNo, String adminPass);

    int addAdmin(String adminNm, String adminNo, String adminPass);

    ArrayList<Admin> findAllAdminInfo();

     int delAdminInfo(Integer adminId);
}
