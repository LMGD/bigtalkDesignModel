package com.lmgd.simple_facotry_v1;

public class OperateAdd extends Operate{

    @Override
    public double getResult() {
        return getNumA()+getNumB();
    }
}
