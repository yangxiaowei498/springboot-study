package com.ethen.core.constant;

public enum  Vehicle {
    CAR("轿车"),
    TRACK("卡车");
    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
