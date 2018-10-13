package com.lmgd.factory;

public class ZyzFactory implements IFactory {
    public LeiFeng createLeiFeng() {
        return new ZyzModel();
    }
}
