package com.lmgd02.template_v1;

public class Client {
    public static void main(String[] args) {
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("答题者2:.....................");

        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
//        TestPaper studentA = new TestPaperA();
//        TestPaper studentB = new TestPaperA();
    }
}
