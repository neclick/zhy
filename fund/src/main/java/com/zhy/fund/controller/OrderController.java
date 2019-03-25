package com.zhy.fund.controller;


import com.zhy.fund.entity.Order;

import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("selectOrders")
    public String selectOrders(Map<String,Object> map){
        List<Order> orderList=orderService.selectOrders();
        map.put("orderList",orderList);
        return "admin/order";
    }
}
