package com.lmgd03.build_v2_03;

import java.util.ArrayList;
import java.util.List;

/**
 * 等于把这个类封装成了List集合
 */
public class Product {

    private List<String> list = new ArrayList<String>();


    public void add(String p) {
        list.add(p);
    }

    public void show() {
        for (String p : list) {
            System.out.println(p);
        }
    }
}