package com.lmgd02.template_v1;

public class TestPaper {
    public void testQuestion1() {
        System.out.println("问题1:你觉得你快乐吗？ a.快乐   b.一般般  c.不快乐");
        System.out.println("答案：" + answer1());
    }

    public void testQuestion2() {
        System.out.println("问题2:你后悔吗？ a.不   b.一般般  c.后悔");
        System.out.println("答案：" + answer2());
    }

    public void testQuestion3() {
        System.out.println("问题3:你进步了吗？ a.进步   b.一般般  c.没哟");
        System.out.println("答案：" + answer3());
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
