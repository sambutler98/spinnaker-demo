package com.demo;

public class Answer {

    private String A;
    private String B;

    public Answer(String a, String b) {
        A = a;
        B = b;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    @Override
    public String toString() {
        return "You play " + A + "                            Opponent plays " + B;
    }
}
