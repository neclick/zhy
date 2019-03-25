package com.zhy.fund.service.impl;

import com.zhy.fund.dao.OrderMapper;
import com.zhy.fund.entity.Order;
import com.zhy.fund.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public ArrayList<Order> selectOrders() {
        return orderMapper.selectOrders();
    }

    @Override
    public int insertOrder(String userNm, String userTel, String productNm, Double amount, Double actAmount, String buyTime) {
        return orderMapper.insertOrder(userNm,userTel,productNm,amount,actAmount,buyTime);
    }
}
