package com.company.sapriko.exception;

public class EmptyCartException extends CustomNotValidException {

    public EmptyCartException() {
        super("NotEmpty", "cart", "items");
    }
}