package com.lmgd03.build;

import com.sun.glass.ui.Pen;

import java.awt.*;

public class Client_v1 {

    public static void main(String[] args) {
        PersonBuilder pbuild = new PersonThinBuilder();
        PersonDirector pd = new PersonDirector(pbuild);
        pd.createPerson();
    }
}
