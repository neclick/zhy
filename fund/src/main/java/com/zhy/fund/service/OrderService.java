package com.zhy.fund.service;

import com.zhy.fund.entity.Order;


import java.util.ArrayList;


public interface OrderService {

    ArrayList<Order> selectOrders();
    int insertOrder(String userNm, String userTel, String productNm,Double amount,Double actAmount, String buyTime);
}
