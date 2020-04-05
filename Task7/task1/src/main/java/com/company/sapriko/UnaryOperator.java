package com.company.sapriko;

@FunctionalInterface
public interface UnaryOperator<T> {

    T apply(T t);
}