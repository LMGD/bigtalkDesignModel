package com.lmgd.simple_facotry_v1;

public class OperateFactory {
    private OperateFactory() {
    }

    public static Operate getObject(char operate) {
        Operate opt = null;
        switch (operate) {
            case '+':
                opt = new OperateAdd();
                break;
            case '-':
                opt = new OperateSub();
                break;
            case '*':
                opt = new OperateMul();
                break;
            case '/':
                opt = new OperateDiv();
                break;
        }
        return opt;
    }
}
