package com.lmgd.simple_facotry_v2_02;

public class CashReturn extends CashSuper {
    private double fullMoney;
    private double dowmMoney;

    public CashReturn(double fullMoney, double dowmMoney) {
        this.fullMoney = fullMoney;
        this.dowmMoney = dowmMoney;
    }

    public double countMoney(double money) {
        return money - (money / fullMoney) * dowmMoney;
    }
}
