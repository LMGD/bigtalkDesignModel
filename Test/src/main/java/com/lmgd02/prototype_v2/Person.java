package com.lmgd02.prototype_v2;

public class Person implements Cloneable {
    private int num;
    private String name;
    private int age;

    private Address addr;

    public Person(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() {
        Person p = null;
        try {
            p = (Person) super.clone();//浅复制
            p.addr = (Address) addr.clone();   //深度复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //  p.addr = (Address)addr.clone();   //深度复制
        return p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}
