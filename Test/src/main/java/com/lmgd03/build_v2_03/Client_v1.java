package com.lmgd03.build_v2_03;

public class Client_v1 {
    public static void main(String[] args) {
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder1();

        b1.builderA();
        b1.builderB();
        Product product1 = b1.getResult();
        product1.show();

    }
}
