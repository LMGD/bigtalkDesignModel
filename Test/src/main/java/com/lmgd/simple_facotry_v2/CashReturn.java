package com.lmgd.simple_facotry_v2;

/**
 * 反利收费子类
 */
public class CashReturn extends CashSuper {
    private double moneyCondition;//满多少
    private double moneyReturn;//减多少

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        return money - (money / moneyCondition) * moneyReturn;
    }
}