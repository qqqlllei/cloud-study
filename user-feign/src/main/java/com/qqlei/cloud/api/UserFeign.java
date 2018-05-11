package com.qqlei.cloud.api;

import com.qqlei.cloud.api.pojo.User;
import com.qqlei.cloud.hystric.UserFeignHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lilei on 2018/4/30.
 *
 *
 *
 *   在使用fegin 的时候，项目不能加添 context-path ,如果添加就会报错，404
 */

@Component
@FeignClient(name = "user-server",fallback = UserFeignHystric.class)
public interface UserFeign {


    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    User getUser(@RequestParam("name") String name);


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    User getUserInfo();
}
