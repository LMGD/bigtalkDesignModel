package com.lmgd04.observer_v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 秘书
 */
public class Secretary {
    //同事列表
    private List<StockObserve> observesList = new ArrayList<StockObserve>();
    private String action;

    /**
     * 增加
     */
    public void attach(StockObserve observe) {
        observesList.add(observe);
    }

    /**
     * 通知
     */
    public void notifyAction() {
        StockObserve.update();
    }

    public List<StockObserve> getObservesList() {
        return observesList;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
