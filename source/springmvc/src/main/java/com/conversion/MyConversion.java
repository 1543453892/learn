package com.conversion;

import com.entity.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by yp on 2018/3/11 23:34
 */
public class MyConversion implements Converter<String, User> {

    public User convert(String source) {
        String[] split = source.split("\\|");
        User user = new User();
        user.setName(split[0]);
        user.setAge(split[1]);
        return user;
    }
}
