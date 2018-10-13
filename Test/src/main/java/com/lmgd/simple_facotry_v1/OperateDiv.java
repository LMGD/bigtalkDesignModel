package com.lmgd.simple_facotry_v1;

public class OperateDiv extends Operate {
    public OperateDiv() {
    }

    @Override
    public double getResult() {
        if (getNumB() == 0)
            throw new RuntimeException("除数不能为0");
        return getNumA() / getNumB();
    }
}
