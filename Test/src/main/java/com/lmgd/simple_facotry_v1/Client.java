package com.lmgd.simple_facotry_v1;

public class Client {
    public static void main(String[] args) {
        Operate opt = OperateFactory.getObject('/');
        opt.setNumA(9);
        opt.setNumB(0);
        double result = opt.getResult();
        System.out.println("结果："+result);
    }
}
