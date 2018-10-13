package com.lmgd.factory;

public class Client  {
    public static void main(String[] args) {
        IFactory factory=new StudentFactory();
        LeiFeng leiFeng = factory.createLeiFeng();

        leiFeng.clearFloor();
        leiFeng.wash();
    }
}
