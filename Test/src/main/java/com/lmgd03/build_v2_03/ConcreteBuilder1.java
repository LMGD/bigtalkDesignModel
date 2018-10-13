package com.lmgd03.build_v2_03;

public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    public void builderA() {
        product.add("傻逼A");
    }

    public void builderB() {
        product.add("傻逼B");
    }

    public Product getResult() {
        return product;
    }
}
