package com.entity;

/**
 * Created by yp on 2018/2/21 11:59
 */
public class AirPlane {
    private boolean motor = false;
    private boolean wing = false;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isWing() {
        return wing;
    }

    public void setWing(boolean wing) {
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "motor=" + motor +
                ", wing=" + wing +
                '}';
    }
}
