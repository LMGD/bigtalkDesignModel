package com.lmgd.simple_facotry_v2_02;


public class CashContent {
    private CashSuper cs = null;

    public CashContent(int type) {
        switch (type) {
            case 0://正常收费
                cs = new CashNormal();
                break;
            case 1://满300 返100
                cs = new CashReturn(300, 100);
                break;
            case 2://打8折
                cs = new CashDiscount(0.8);
                break;
        }
    }

    public double countMoney(double money) {
        return cs.countMoney(money);
    }
}
