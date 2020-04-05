package com.company.sapriko;

@FunctionalInterface
public interface BinaryOperator<T> {

    T apply(T t1, T t2);
}