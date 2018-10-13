package com.lmgd.proxy;

public class ZjzPerson extends Send{

    private SchoolGirl jiaojiao;

    public ZjzPerson(SchoolGirl jiaojiao) {
        this.jiaojiao = jiaojiao;
    }

    public void sendFlows() {
        System.out.println("送花");
    }

    public void sendEat() {
        System.out.println("送吃的");
    }
}
