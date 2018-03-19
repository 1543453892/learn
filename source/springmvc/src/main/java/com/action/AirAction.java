package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yp on 2018/3/8 21:34
 */
@Controller
@RequestMapping("/airplane")
public class AirAction {

    public static final Map<String,String> planes = new HashMap<String, String>(3);
    static {
        planes.put("1","波音757");
        planes.put("2","歼20");
        planes.put("3","幻影2000");
    }

    @RequestMapping("/plane/{id}")
    @ResponseBody
    public String getPlane(@PathVariable("id") String id){
        return planes.get(id);
    }


}
