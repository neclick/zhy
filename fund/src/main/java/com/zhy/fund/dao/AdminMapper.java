package com.zhy.fund.dao;

import com.zhy.fund.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    public Admin login(@Param("adminNm") String adminNm,@Param("adminNo") String adminNo,@Param("adminPass") String adminPass);

    int addAdmin(String adminNm, String adminNo, String adminPass);

    ArrayList<Admin> findAllUserinfo();
}