package com.company.sapriko;


@FunctionalInterface
interface MyConsumer {

    void accept(Integer value);

    static int add(int x, int y) {
        return x + y;
    }

    default void speedCar() {
        accept(250);
    }
}