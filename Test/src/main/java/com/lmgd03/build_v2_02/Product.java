package com.lmgd03.build_v2_02;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String p : parts) {
            System.out.println(p);
        }
    }
}
