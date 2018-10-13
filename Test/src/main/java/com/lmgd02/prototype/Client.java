package com.lmgd02.prototype;

public class Client {
    public static void main(String[] args) {
        ConcreteProtoType protoType=new ConcreteProtoType("111");
        ConcreteProtoType protoType2 =(ConcreteProtoType) protoType.clone();

        System.out.println(protoType.getId());
        System.out.println(protoType2.getId());
    }
}
