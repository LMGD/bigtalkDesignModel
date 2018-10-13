package com.lmgd02.template_v2;

public abstract class AbstractClass {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templatemethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("...templatemethod end");
    }
}
