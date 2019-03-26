package com.zhy.fund.dao;

import com.zhy.fund.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    ArrayList<Order> selectOrders();
    int insertOrder(@Param("userNm") String userNm, @Param("userTel") String userTel, @Param("productNm") String productNm, @Param("amount") Double amount, @Param("actAmount") Double actAmount, @Param("buyTime") String buyTime);
}