package com.qqlei.cloud.user.controller;

import com.qqlei.cloud.api.UserFeign;
import com.qqlei.cloud.api.pojo.User;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lilei on 2018/4/30.
 */
@RestController
public class UserController implements UserFeign {



    @Override
    public User getUser(String name) {

        User user = new User();
        user.setAge("23");
        user.setName(name);
        return user;
    }

    @Override
    public User getUserInfo() {
        User user = new User();
        user.setAge("26");
        user.setName("接口改变");
        return user;
    }
}
