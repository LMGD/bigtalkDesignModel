package com.lmgd04.observer_v1;

/**
 * 双向耦合代码(同事类与秘书类互相依赖)
 */
public class Client {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setAction("关闭股票行情，继续工作！");

        StockObserve so1 = new StockObserve("LMGD", secretary);
        StockObserve so2 = new StockObserve("sb", secretary);

        secretary.attach(so1);
        secretary.attach(so2);

        secretary.notifyAction();

    }
}