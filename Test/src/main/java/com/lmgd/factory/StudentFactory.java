package com.lmgd.factory;

public class StudentFactory implements  IFactory {
    public LeiFeng createLeiFeng() {
        return new Student();
    }
}
