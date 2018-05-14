package com.qqlei.cloud.product.controller;

import com.alibaba.fastjson.JSONObject;
import com.qqlei.cloud.api.UserFeign;
import com.qqlei.cloud.api.pojo.User;
import com.qqlei.cloud.product.domain.Product;
import com.qqlei.cloud.product.service.ProductService;

import com.reliable.message.model.domain.MqMessageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by lilei on 2018/4/30.
 */
@RestController
public class ProductController {

    @Autowired
    private UserFeign userFeign;

    @Autowired
    private ProductService productService;

    @RequestMapping("/get")
    String getUserProductInfo(String name){
        User user = userFeign.getUser(name);
        return "user:"+user.getName()+","+user.getAge()+",product:macbook";
    }

    @RequestMapping("/save")
    String saveProduct(){
        Product product = new Product();
        int id = new Random().nextInt();
        product.setId(id);
        product.setBrandId(new Random().nextInt());
        product.setName(id+":商品名称");
        MqMessageData mqMessageData = new MqMessageData(JSONObject.toJSONString(product),"SAVE_PRODUCT",String.valueOf(product.getBrandId()));
        int change = productService.saveProduct(mqMessageData,product);
//        int change = productService.insert(product);
        return "insert:"+change+","+product.getName();
    }

}
