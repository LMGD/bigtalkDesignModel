package com.lmgd.simple_facotry_v2_02;

public class CashFactory {
    private CashFactory() {
    }

    public static CashSuper createCashAcctep(int type) {
        CashSuper cs = null;
        switch (type) {
            case 0:
                cs = new CashNormal();
                break;
            case 1:
                cs = new CashDiscount(0.8);
                break;
            case 2:
                cs = new CashReturn(300, 100);
                break;
        }
        return cs;
    }

//    public static double countMoney(int type, double money) {
//        CashSuper cashAcctep = createCashAcctep(type);
//        return cashAcctep.countMoney(money);
//    }
}
