package com.main;

import com.entity.AirPlane;

import java.lang.ref.WeakReference;

/**
 * Created by yp on 2018/2/21 17:50
 */
public class WeakTest {
    private static AirPlane plane;
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        WeakReference wr = new WeakReference<AirPlane>(airPlane);
        WeakTest.plane = airPlane;
        airPlane = null;
        System.gc();
        System.out.println(wr.get());
    }
}
