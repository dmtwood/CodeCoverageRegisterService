package com.dimidev.sdt.codecoverage.exceptions;

public class UserException extends Exception {
    private static final long serialVersionUID = 1L;
    public UserException() {
        super("Detected an empty string!");
    }
}
