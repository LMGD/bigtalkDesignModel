package com.lmgd03.build_v2;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
