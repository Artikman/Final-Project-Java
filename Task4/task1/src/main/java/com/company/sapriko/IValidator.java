package com.company.sapriko;

/**
 * Interface describes model of IValidator
 * @author – Artyom Sapriko.
 */
public interface IValidator<T> {

    /**
     * This method describes logic validate
     *
     * @param value – name of value
     */
    boolean validate(T value);
}