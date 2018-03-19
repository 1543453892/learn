package com.service;

import com.entity.AirPlane;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yp on 2018/2/21 11:58
 */
@Service
public class GenAirplane {

    @Resource
    private AssembleService assembleService;

    public AirPlane gen(){
        AirPlane airPlane = new AirPlane();
        assembleService.assemble(airPlane);
        return airPlane;
    }
}
