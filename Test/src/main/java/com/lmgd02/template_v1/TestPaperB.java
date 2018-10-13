package com.lmgd02.template_v1;

public class TestPaperB extends TestPaper {
    private static final String answerA = "A";

    public TestPaperB() {
    }

    @Override
    public void testQuestion1() {
        super.testQuestion1();
    }

    @Override
    public void testQuestion2() {
        super.testQuestion2();
    }

    @Override
    public void testQuestion3() {
        super.testQuestion3();
    }

    @Override
    protected String answer1() {
        return answerA;
    }

    @Override
    protected String answer2() {
        return answerA;
    }

    @Override
    protected String answer3() {
        return answerA;
    }
}
