package com.lmgd02.prototype_v2;

public class Client_v3 {
    public static void main(String[] args) {
        Address addr=new Address();
        addr.setAdd("上海市");

        Person per1=new Person(1,"LMGD",100);
        per1.setAddr(addr);
        Person per2 =(Person) per1.clone();

        System.out.println(per1);
        System.out.println(per2);

        //addr.setAdd("宝山区");(与  per1.getAddr().setAdd("宝山区"); 意思一样 )
        per1.getAddr().setAdd("宝山区");//只改变per1 的addr属性,如果 Address 对象 不克隆,那么 对象 per1、per2 的addr 属性的值都会变
        System.out.println(per1);
        System.out.println(per2);

//        输出内容:
//        Person{num=1, name='LMGD', age=100, addr=Address{add='上海市'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='上海市'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='宝山区'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='上海市'}}

// 如果 Address 对象 不 克隆  输出的就是
//        Person{num=1, name='LMGD', age=100, addr=Address{add='上海市'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='上海市'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='宝山区'}}
//        Person{num=1, name='LMGD', age=100, addr=Address{add='宝山区'}}


    }
}
