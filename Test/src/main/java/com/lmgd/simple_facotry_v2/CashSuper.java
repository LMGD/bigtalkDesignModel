package com.lmgd.simple_facotry_v2;

/**
 * 收费抽象类
 */
public abstract class CashSuper {
    /**
     * 收取现金的方法
     *
     * @param money:原价
     * @return：返回当前价格
     */
    public abstract double acceptCash(double money);
}
