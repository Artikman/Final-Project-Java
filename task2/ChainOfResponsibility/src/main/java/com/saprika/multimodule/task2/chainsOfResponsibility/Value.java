package com.saprika.multimodule.task2.chainsOfResponsibility;
/**
 * Class describes model of Value
 * @author – Artyom Sapryka.
 */
public class Value {
    /**
     * This field contains information about value
     */
    private boolean value;
    /**
     * constructor
     */
    public Value(boolean value) {
        this.value = value;
    }
    /**
     * This method describes logic getValue
     *
     * @return – describe return value.
     */
    boolean getValue() {
        return value;
    }
}