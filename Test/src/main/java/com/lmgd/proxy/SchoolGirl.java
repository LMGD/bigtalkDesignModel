package com.lmgd.proxy;

import java.io.Serializable;

public class SchoolGirl implements Serializable {
    private String name;

    public SchoolGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
