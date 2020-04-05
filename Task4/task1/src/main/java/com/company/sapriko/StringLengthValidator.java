package com.company.sapriko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class describes model of StringLengthValidator
 * - implements – names of IValidator.
 * @author – Artyom Sapriko.
 */
class StringLengthValidator implements IValidator<String> {


    /**
     * This field contains information about maxLength
     */
    private Integer maxLength;

    /**
     * This field contains information about line
     */
    private String line;

    /**
     * This method describes logic getMaxLength
     *
     * @return – describe return value.
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * This method describes logic getLine
     *
     * @return – describe return value.
     */
    public String getLine() {
        return line;
    }

    //constructor
    StringLengthValidator(Integer maxLength, String line) {
        this.maxLength = maxLength;
        this.line = line;
    }

    /**
     * This method describes logic validate
     *
     * @param value – name of value
     * @return – describe return value.
     */
    public boolean validate(String value) {
        Pattern pattern = Pattern.compile(line);
        Matcher matcher = pattern.matcher(value);
        return (value.length() < maxLength) && matcher.find();
    }
}