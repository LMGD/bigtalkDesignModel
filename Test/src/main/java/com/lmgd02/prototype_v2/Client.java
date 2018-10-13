package com.lmgd02.prototype_v2;

public class Client {
    public static void main(String[] args) {
        Student s1=new Student(1,"LMGD",9);
        Student s2=s1;//使得两个对象指向同一内存堆

        //s2.setNum(222);//s1、s2的num属性都会变成 222 因为  两个对象指向同一内存堆
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
