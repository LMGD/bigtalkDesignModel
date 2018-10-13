package com.lmgd03.build;

/**
 * 建造者模式中最重要的类
 */
public class PersonDirector {

    private PersonBuilder pb;//注：瘦子、高子的父类都是pb，那么在客户端，有客户吗决定实例化哪个类。

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson() {
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegRight();
        pb.buildArmRight();
        pb.buildLegRight();
    }
}
