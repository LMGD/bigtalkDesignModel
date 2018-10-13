package com.lmgd02.prototype_v2;

public class Client_v2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //克隆
        Person p = new Person(1, "LMGD", 8);
        Person p2 = (Person) p.clone();
        System.out.println("sb 1号:" + p.getNum() + "," + p.getName());
        System.out.println("sb 2号:" + p2.getNum() + "," + p2.getName());

       // p2.setNum(9999);//只改变 p2的num属性，因为  p 和 p2  指向的不是一个内存推

       // System.out.println("sb 1号:" + p.getNum() + "," + p.getName());
       // System.out.println("sb 2号:" + p2.getNum() + "," + p2.getName());
        System.out.println(p==p2);
    }
}
