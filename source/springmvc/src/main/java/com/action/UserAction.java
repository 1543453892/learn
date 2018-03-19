package com.action;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yp on 2018/3/11 23:39
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    @RequestMapping("/get")
    @ResponseBody
    public String getPlane(User user) {
        return user.toString();
    }
}
