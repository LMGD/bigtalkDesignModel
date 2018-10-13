package com.lmgd02.facade_v1;

/**
 * 基金
 */
public class Fund {

    private Stock1 s1;
    private Stock2 s2;
    private Stock3 s3;
    private NationalDebt nd;

    public Fund() {
        s1 = new Stock1();
        s2 = new Stock2();
        s3 = new Stock3();
        nd = new NationalDebt();
    }

    public void buyFund() {
        s1.buy();
        s2.buy();
        s3.buy();
        nd.buy();
    }

    public void sellFund() {
        s1.sell();
        s2.sell();
        s3.sell();
        nd.sell();
    }


}
