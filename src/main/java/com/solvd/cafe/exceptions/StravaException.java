package com.solvd.cafe.exceptions;


public class StravaException extends Exception {

    public StravaException() {
        super("Exception");
    }

    public StravaException(String message) {
        super(message);
    }
}
