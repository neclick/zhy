package com.zhy.fund.dao;

import com.zhy.fund.entity.Order;

import java.util.ArrayList;


public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    ArrayList<Order> selectOrders();
}