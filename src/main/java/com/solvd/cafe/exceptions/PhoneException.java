package com.solvd.cafe.exceptions;


public class PhoneException extends Exception {

    public PhoneException() {
        super("You entered an invalid phone number");
    }

    public PhoneException(String message) {
        super(message);
    }
}
