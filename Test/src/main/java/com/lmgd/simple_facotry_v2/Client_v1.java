package com.lmgd.simple_facotry_v2;

/**
 * 工产模式下的
 */
public class Client_v1 {
    public static void main(String[] args) {
        CashSuper cs = CashFactory.createCashAccept(2);
        double cash = cs.acceptCash(900);
        System.out.println(cash);
        //  System.out.println(900 * 0.8);
    }
}
