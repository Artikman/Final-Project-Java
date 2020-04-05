package com.company.sapriko.exception;

public class UnknownProductException extends CustomNotValidException {

    public UnknownProductException() {
        super("NotExist", "product", "id");
    }
}