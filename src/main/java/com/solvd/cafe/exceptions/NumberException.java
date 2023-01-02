package com.solvd.cafe.exceptions;


public class NumberException extends Exception {
    public NumberException() {
        super("You entered an invalid number");
    }

    public NumberException(String message) {
        super(message);
    }
}
