package com.lmgd.uml;

/**
 * 企鹅
 */
public class Penguin extends Bird {
    //企鹅知道气候的变化
    private Weather weather;

    public Penguin(Oxygen oxygen, Water water) {
        super(oxygen, water);
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}


