package com.lmgd.simple_facotry_v1;

public class OperateSub extends Operate {

    public OperateSub() {
    }

    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }
}
