package com.qqlei.cloud.hystric;

import com.qqlei.cloud.api.UserFeign;
import com.qqlei.cloud.api.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lilei on 2018/5/1.
 */
@Component
public class UserFeignHystric implements UserFeign{
    @Override
    public User getUser(@RequestParam("name") String name) {
        User user = new User();
        user.setName("fallback");
        user.setAge("0");
        return user;
    }

    @Override
    public User getUserInfo() {
        User user = new User();
        user.setName("fallback");
        user.setAge("0");
        return user;
    }
}
