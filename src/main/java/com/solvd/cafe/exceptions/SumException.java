package com.solvd.cafe.exceptions;


public class SumException extends Exception {

    public SumException() { super("Exception"); }

    public SumException(String message) {
        super(message);
    }
}