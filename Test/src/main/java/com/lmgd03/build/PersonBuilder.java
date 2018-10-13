package com.lmgd03.build;

import com.sun.glass.ui.Pen;

import java.awt.*;

public abstract class PersonBuilder {
    protected Graphics g;
    protected Pen p;

    public PersonBuilder(Graphics g, Pen p) {
        this.g = g;
        this.p = p;
    }

    public PersonBuilder(Pen p) {
        this.p = p;
    }

    public PersonBuilder() {
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
