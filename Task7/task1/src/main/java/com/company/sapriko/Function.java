package com.company.sapriko;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);
}