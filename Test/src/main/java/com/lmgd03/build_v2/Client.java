package com.lmgd03.build_v2;

public class Client {
    public static void main(String[] args) {
        Builder b = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        Director d = new Director();
        d.construct(b);

        Director d2 = new Director();
        d2.construct(b2);

        Product result = b.getResult();
        Product result1 = b2.getResult();

        result.show();
        result1.show();
    }
}
