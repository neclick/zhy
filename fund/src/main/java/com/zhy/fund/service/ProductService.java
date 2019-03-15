package com.zhy.fund.service;

import com.zhy.fund.entity.Product;

public interface ProductService {
    int addProduct(Product arg);
    Product isContain(String code);
}
