package com.lmgd03.build_v2_02;

public class Client {
    public static void main(String[] args) {
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        Director d = new Director();
        Director d2 = new Director();

        d.construct(b1);
        Product product = d.show();
        product.show();

        d.construct(b2);
        Product product2 = d2.show();
        product2.show();
    }
}
