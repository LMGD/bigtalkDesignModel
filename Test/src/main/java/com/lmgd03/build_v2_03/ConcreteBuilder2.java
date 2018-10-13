package com.lmgd03.build_v2_03;

public class ConcreteBuilder2 implements Builder {

    private Product product = new Product();

    public void builderA() {
        product.add("傻逼CC");
    }

    public void builderB() {
        product.add("傻逼DD");
    }

    public Product getResult() {
        return product;
    }
}
