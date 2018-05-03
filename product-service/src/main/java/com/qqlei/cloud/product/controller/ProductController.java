package com.qqlei.cloud.product.controller;

import com.qqlei.cloud.api.UserFeign;
import com.qqlei.cloud.api.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lilei on 2018/4/30.
 */
@RestController
public class ProductController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/get")
    String getUserProductInfo(String name){
        User user = userFeign.getUser(name);
        return "user:"+user.getName()+","+user.getAge()+",product:macbook";
    }
}
