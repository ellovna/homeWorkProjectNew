package com.hw.exceptions;

public class UnderAgeException extends RuntimeException{
    public UnderAgeException(String message) {
        super(message);
    }

    public void printStackTrace() {
    }
}
