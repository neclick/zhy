package com.zhy.fund.service.impl;

import com.zhy.fund.dao.OrderMapper;
import com.zhy.fund.entity.Product;
import com.zhy.fund.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProductById(String productId) {
        return null;
    }

    @Override
    public int insertOrder(String userNm, String userTel, String productNm, Double amount, Double actAmount, String buyTime) {
        return orderMapper.insertOrder(userNm,userTel,productNm,amount,actAmount,buyTime);
    }
}
