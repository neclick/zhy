package com.zhy.fund.service;

import com.zhy.fund.entity.Order;

import java.util.ArrayList;


public interface OrderService {
    /**
     * 获取所有订单列表
     * @return
     */
    ArrayList<Order> selectOrders();

}
