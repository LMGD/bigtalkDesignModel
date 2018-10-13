package com.lmgd.simple_facotry_v2;

/**
 * 策略模式与简单工厂模式结合
 */
public class CashContent {
    private CashSuper cs = null;

    public CashContent(int type) {
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
    }


    /**
     * @param money:原价
     * @return ：返回的价格
     */
    public double countMoney(double money) {
        return cs.acceptCash(money);
    }
}
