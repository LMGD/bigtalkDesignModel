package com.lmgd.simple_facotry_v2;

/**
 * 现金收费工厂
 */
public class CashFactory {
    public CashFactory() {
    }

    /**
     * 现金收取工厂
     *
     * @param type
     * @return
     */
    public static CashSuper createCashAccept(int type) {
        CashSuper cs = null;
        switch (type) {
            case 0://正常收费
                cs = new CashNormal();
                break;
            case 1://满300 返100
                cs = new CashReturn("300", "100");
                break;
            case 2://打8折
                cs = new CashRebate("0.8");
                break;
        }
        return cs;
    }
}
