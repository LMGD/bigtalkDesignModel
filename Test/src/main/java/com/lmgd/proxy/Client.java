package com.lmgd.proxy;

public class Client {
    public static void main(String[] args) {
        SchoolGirl jiaojiao=new SchoolGirl("jiaojiao");
        Proxy proxy=new Proxy(jiaojiao);

        proxy.sendEat();
        proxy.sendFlows();
    }
}
