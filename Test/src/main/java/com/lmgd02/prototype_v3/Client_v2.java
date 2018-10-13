package com.lmgd02.prototype_v3;

public class Client_v2 {
    public static void main(String[] args) {
        ResumeV2 r1 = new ResumeV2("具东魅");
        r1.setPersonalInfo("男", "9");
        r1.setWorkExprience("2016-2018", "丛拓");

        ResumeV2 r2 = (ResumeV2) r1.clone();
        ResumeV2 r3 = (ResumeV2) r1.clone();

      //  r2.getWork().setCompany("嗯哼哼");//work的值改变了，r1、r2、r3对象里面的 work 属性值都会跟着一起变。

        //显示、输出
        r1.display();
        r2.display();
        r3.display();



        //ResumeV2  克隆了，JVM给 r1、r2、r3分配了不同的内存地址
        System.out.println(r1 == r2);//false
        System.out.println(r1 == r3);//false
        System.out.println(r3 == r2);//false

        //但是 ResumeV2  的属性 WorkExprience work,引用对象没有克隆，那么 r1、r2、r3对象里面的 work 属性指向的都是同一内存地址。
        //所以, work的值改变了，r1、r2、r3对象里面的 work 属性值都会跟着一起变。
        System.out.println(r1.getWork() == r2.getWork());//true
        System.out.println(r1.getWork() == r3.getWork());//true
        System.out.println(r3.getWork() == r2.getWork());//true
    }
}
