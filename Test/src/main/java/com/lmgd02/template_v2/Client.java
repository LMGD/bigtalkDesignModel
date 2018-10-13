package com.lmgd02.template_v2;

public class Client {
    public static void main(String[] args) {
        AbstractClass modelA = new ConcreteClassA();
        modelA.templatemethod();

        AbstractClass modelB = new ConcreteClassB();
        modelB.templatemethod();
    }
}
