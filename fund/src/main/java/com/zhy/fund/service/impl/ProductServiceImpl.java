package com.zhy.fund.service.impl;

import com.zhy.fund.dao.ProductMapper;
import com.zhy.fund.entity.Product;
import com.zhy.fund.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public int addProduct(Product arg) {
        return productMapper.addProduct(arg);
    }

    @Override
    public Product isContain(String code) {
        return productMapper.isContain(code);
    }
}
