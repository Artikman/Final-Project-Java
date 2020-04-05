package com.company.sapriko;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}