package com.lmgd.simple_facotry_v2;

public class Client_v2 {

    /**
     * 策略模式与简单工厂模式结合(特点：只关注一个类CashContent)
     */
    public static void main(String[] args) {
        CashContent cashContent = new CashContent(1);
        double money = cashContent.countMoney(900);
        System.out.println(money);

        /*
         *工产模式下的(需要关注2个类)[CashSuper、CashFactory]
         */
        CashSuper cs = CashFactory.createCashAccept(2);
        double cash = cs.acceptCash(900);
        System.out.println(cash);
    }
}
