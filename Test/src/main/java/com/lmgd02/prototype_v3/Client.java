package com.lmgd02.prototype_v3;

public class Client {
    public static void main(String[] args) {
        Resume r1 = new Resume("LMGD");
        r1.setAge("9");
        r1.setSex("男");
        r1.setCompany("丛拓");
        r1.setTimeArea("2016-2018");

        Resume r2 = (Resume) r1.clone();
        Resume r3 = (Resume) r1.clone();
        r3.setCompany("嗯哼");

        r1.display();
        r2.display();
        r3.display();

        //注意（情况1）：被复制的对象的属性 全部是值类型，则对该字段执行逐位复制。
        //输出的都是 false:说明 r1、r2、r3 分别 指向不同对象，JVM给他们分配的不同的 内存堆。
        System.out.println(r1 == r2);//false
        System.out.println(r1 == r3);//false
        System.out.println(r3 == r2);//false
    }
}
