package com.saprika.multimodule.task2.decorator;
/**
 * Class describes model of CafeDecorator
 * - implements – names of Cafe.
 * @author – Artyom Sapryka.
 */
public abstract class CafeDecorator implements Cafe {
    /**
     * This field contains information about decorated
     */
    private Cafe decorated;

    /**
     * constructor
     * @param decorated
     */
    public CafeDecorator(Cafe decorated) {
        this.decorated = decorated;
    }
    /**
     * This method describes logic toSubmitAnOrder
     */
    public void toSubmitAnOrder() {
        decorated.toSubmitAnOrder();
    }
}