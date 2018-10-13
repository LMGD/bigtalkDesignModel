package com.lmgd.simple_facotry_v1;

public class OperateMul extends Operate {
    public OperateMul() {
    }

    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
