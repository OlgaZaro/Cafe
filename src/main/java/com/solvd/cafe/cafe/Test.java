package com.solvd.cafe.cafe;


public final class Test {
    private final int CONSTANT;

    public Test(int CONSTANT) {
        this.CONSTANT = CONSTANT;
    }

    public int getCONSTANT() {
        return CONSTANT;
    }

    public final void constant() {
        System.out.println(CONSTANT == 5);
    }
}
