package com.lmgd04.observer_v1;

import java.util.List;

/**
 * 股票观察者(同事)
 */
public class StockObserve {
    private String name;
    private static Secretary sub;

    public StockObserve(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public static void update() {
        List<StockObserve> observesList = sub.getObservesList();
        for (StockObserve s : observesList) {
            System.out.println(s.getName() + sub.getAction());
        }
    }

    public String getName() {
        return name;
    }
}
