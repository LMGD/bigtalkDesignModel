package com.lmgd03.build_v2_02;

/**
 * 指挥者，指挥创建哪一个类
 */
public class Director {
    private Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;

        builder.buildPartA();
        builder.buildPartB();
    }

    public Product show() {
        return builder.getResult();
    }
}
