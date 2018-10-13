package com.lmgd.factory;

import java.io.Serializable;

public class LeiFeng implements Serializable {

    private String name;

    public LeiFeng() {
    }

    public void clearFloor(){
        System.out.println("掃地");
    }

    public void wash(){
        System.out.println("洗衣服");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
