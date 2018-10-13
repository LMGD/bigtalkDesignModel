package com.lmgd03.build_v2_02;

public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    public void buildPartA() {
        product.add("部件LM");
    }

    public void buildPartB() {
        product.add("部件GD");
    }

    public Product getResult() {
        return product;
    }
}
