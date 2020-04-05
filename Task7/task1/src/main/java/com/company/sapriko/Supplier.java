package com.company.sapriko;

@FunctionalInterface
public interface Supplier<T> {

    T get();
}