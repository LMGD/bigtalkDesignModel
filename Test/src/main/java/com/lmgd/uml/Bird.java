package com.lmgd.uml;

public class Bird extends Animal {
    //翅膀和鸟事组合关系
    private Wing wing;

    public Bird() {
        wing = new Wing();//bird类初始化时候，实例化Wing
    }

    public Bird(Oxygen oxygen, Water water) {
        super(oxygen, water);
    }


}
