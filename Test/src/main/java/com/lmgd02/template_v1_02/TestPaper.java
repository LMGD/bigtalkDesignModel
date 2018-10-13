package com.lmgd02.template_v1_02;

public class TestPaper {

    public void testQuestion1() {
        System.out.println("問題1...?  a.x b.xx c.xxx");
        System.out.println("答案:" + answer1());
    }

    public void testQuestion2() {
        System.out.println("問題2...?  a.x b.xx c.xxx");
        System.out.println("答案:" + answer2());
    }

    public void testQuestion3() {
        System.out.println("問題3...?  a.x b.xx c.xxx");
        System.out.println("答案:" + answer3());
    }

    protected String answer1() {
        return "";
    }

    protected String answer2() {
        return "";
    }

    protected String answer3() {
        return "";
    }
}
