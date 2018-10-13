package com.lmgd03.build;

import com.sun.glass.ui.Pen;

import java.awt.*;

public class PersonFatBuild extends PersonBuilder {

    public PersonFatBuild(Graphics g, Pen p) {
        super(g, p);
    }

    @Override
    public void buildHead() {
        g.drawLine(90, 90, 90, 90);
    }

    @Override
    public void buildBody() {
        g.drawLine(90, 90, 90, 90);
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(90, 90, 90, 90);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(90, 90, 90, 90);
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(90, 90, 90, 90);
    }

    @Override
    public void buildLegRight() {
        g.drawLine(90, 90, 90, 90);
    }
}
