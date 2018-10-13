package com.lmgd02.template_v1_02;

public class Client {
    public static void main(String[] args) {
        System.out.println("第一个学生的答题：");
        TestPaper sa = new StudentA();
        sa.testQuestion1();
        sa.testQuestion2();
        sa.testQuestion3();

        System.out.println("第二个学生的答题：");
        TestPaper sb = new StudentB();
        sb.testQuestion1();
        sb.testQuestion2();
        sb.testQuestion3();
    }
}
