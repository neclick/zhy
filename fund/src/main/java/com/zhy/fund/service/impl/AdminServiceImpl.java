package com.zhy.fund.service.impl;

import com.zhy.fund.dao.AdminMapper;
import com.zhy.fund.entity.Admin;
import com.zhy.fund.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;


    @Override
    public Admin login(String adminNm, String adminNo, String adminPass) {
        return adminMapper.login(adminNm,adminNo,adminPass);
    }

    @Override
    public int addAdmin(String adminNm, String adminNo, String adminPass) {
        return adminMapper.addAdmin(adminNm,adminNo,adminPass);
    }

    @Override
    public ArrayList<Admin> findAllAdminInfo() {
        return adminMapper.findAllAdminInfo() ;
    }

}
