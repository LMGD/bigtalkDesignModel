package com.lmgd.simple_facotry_v2;

/**
 * 打折类
 */
public class CashRebate extends CashSuper {

    //打折
    private double moneyRebate;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
