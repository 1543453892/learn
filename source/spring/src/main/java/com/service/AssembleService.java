package com.service;

import com.entity.AirPlane;
import org.springframework.stereotype.Service;

/**
 * Created by yp on 2018/2/21 11:57
 */
@Service
public class AssembleService {

    public void assemble(AirPlane airPlane){
        airPlane.setMotor(true);
        airPlane.setWing(true);
    }

}
