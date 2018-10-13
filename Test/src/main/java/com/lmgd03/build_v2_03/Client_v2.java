package com.lmgd03.build_v2_03;

public class Client_v2 {
    public static void main(String[] args) {
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        Director director = new Director();
        director.construct(b2);

        Product product = b2.getResult();
        product.show();
    }
}
