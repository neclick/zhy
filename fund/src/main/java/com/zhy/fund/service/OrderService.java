package com.zhy.fund.service;

import com.zhy.fund.entity.Product;

import java.util.List;

public interface OrderService {
    /**
     * 获取所有产品列表
     * @return
     */
    List<Product> getProducts();

    /**
     * 根据产品ID查询产品详情
     * @param productId
     * @return
     */
    Product getProductById(String productId);
}
