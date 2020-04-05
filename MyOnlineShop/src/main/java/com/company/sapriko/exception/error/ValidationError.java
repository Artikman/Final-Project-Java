package com.company.sapriko.exception.error;

import java.util.ArrayList;
import java.util.List;

public class ValidationError {

    private final List<FieldError> fieldErrors = new ArrayList<FieldError>();

    public ValidationError() {}

    public void addFiledError(String path, String message) {
        FieldError error = new FieldError(path, message);
        fieldErrors.add(error);
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }
}