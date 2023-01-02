package com.solvd.cafe.exceptions;


public class EmailException extends Exception {
    public EmailException() {
        super("You entered an invalid email");
    }

    public EmailException(String message) {
        super(message);
    }
}
