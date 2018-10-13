package com.lmgd02.template_v1;

public class TestPaperA extends TestPaper {
    private static final String answerA = "a";

    public TestPaperA() {
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
