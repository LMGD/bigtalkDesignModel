package com.lmgd.uml;

public class Animal {
    private Oxygen oxygen;//氧气
    private Water water;

    public Animal() {
    }

    public Animal(Oxygen oxygen, Water water) {
        this.oxygen = oxygen;
        this.water = water;
    }

    public Oxygen getOxygen() {


        return oxygen;
    }

    public void setOxygen(Oxygen oxygen) {
        this.oxygen = oxygen;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}


