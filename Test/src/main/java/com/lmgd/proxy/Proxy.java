package com.lmgd.proxy;

public class Proxy extends Send {
    private ZjzPerson zjzPerson;

    public Proxy(SchoolGirl jiaojiao) {
        this.zjzPerson = new ZjzPerson(jiaojiao);
    }

    public void sendFlows() {
        zjzPerson.sendFlows();
    }

    public void sendEat() {
        zjzPerson.sendEat();
    }
}
