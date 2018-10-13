package com.lmgd02.facade_v1;

public class Client_v1 {
    public static void main(String[] args) {
        Stock1 s1 = new Stock1();
        s1.buy();
        s1.sell();

        Stock2 s2 = new Stock2();
        s2.buy();
        s2.sell();

        Stock3 s3 = new Stock3();
        s3.buy();
        s3.sell();

        NationalDebt nd = new NationalDebt();
        nd.buy();
        nd.sell();
    }
}
