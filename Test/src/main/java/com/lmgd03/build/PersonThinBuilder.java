package com.lmgd03.build;


import com.sun.glass.ui.Pen;

import java.awt.*;

public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Graphics g, Pen p) {
        super(g, p);
    }

    public PersonThinBuilder() {
    }

    public void buildHead() {
        g.drawLine(10, 10, 10, 10);
    }

    public void buildBody() {
        g.drawLine(10, 10, 10, 10);
    }

    public void buildArmLeft() {
        g.drawLine(10, 10, 10, 10);
    }

    public void buildArmRight() {
        g.drawLine(10, 10, 10, 10);
    }

    public void buildLegLeft() {
        g.drawLine(10, 10, 10, 10);
    }

    public void buildLegRight() {
        g.drawLine(10, 10, 10, 10);
    }
}
