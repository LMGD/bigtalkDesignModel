package com.lmgd.simple_facotry_v2_02;

public class CashDiscount extends CashSuper {

    private double discount;

    public CashDiscount(double discount) {
        this.discount = discount;
    }

    public double countMoney(double money) {
        return money * discount;
    }
}
