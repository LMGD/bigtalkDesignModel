package com.lmgd02.prototype;

public abstract class ProtoType {
    private String id;

    public ProtoType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  abstract  ProtoType clone();
}
