package com.books.exceptions;

public class NotFoundBookCustomException extends Exception {
    private final String message;

    public NotFoundBookCustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
