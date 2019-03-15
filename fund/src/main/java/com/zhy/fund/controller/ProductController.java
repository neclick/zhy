package com.zhy.fund.controller;

import com.zhy.fund.entity.Product;
import com.zhy.fund.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    Product product=new Product();
    @GetMapping("psingle")
    public String singlepage(@RequestParam("name") String name, @RequestParam("code") String code, @RequestParam("totalnet") Double totalnet, @RequestParam("newnet") Double newnet, @RequestParam("daygrowrate") Double daygrowrate, @RequestParam("dayincrease") String dayincrease, Map<String,Object> map){
        product.setProductNm(name);
        product.setFundCode(code);
        product.setNewNet(newnet);
        product.setDayGrowRate(daygrowrate);
        product.setTatalNet(totalnet);
        product.setTotalShare(dayincrease);
        List<Product> plist=new ArrayList<Product>();
        plist.add(product);
        map.put("plist",plist);
        if(productService.isContain(code)==null) {
            if (productService.addProduct(product) > 0) {
                return "details";
            }
        }
            return "details";
    }
}
