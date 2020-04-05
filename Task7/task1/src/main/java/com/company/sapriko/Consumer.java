package com.company.sapriko;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}