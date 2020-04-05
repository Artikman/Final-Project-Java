package com.saprika.multimodule.task2.decorator;

import java.util.logging.Logger;
/**
 * Class describes model of AdditiveCafeDecorator
 * - implements – names of CafeDecorator.
 * @author – Artyom Sapryka.
 */
public class AdditiveCafeDecorator extends CafeDecorator {

    private final static Logger logger = Logger.getLogger(String.valueOf(AdditiveCafeDecorator.class));
    /**
     * constructor
     * @param decorated
     */
    public AdditiveCafeDecorator(Cafe decorated) {
        super(decorated);
    }
    /**
     * This method describes logic toSubmitAnOrder
     */
    public void toSubmitAnOrder() {
        setGreenTea();
        setBlackTea();
        setСappuccinoCoffee();
        setAmericanoCoffee();
    }
    /**
     * This method describes logic setGreenTea
     */
    private void setGreenTea(){
        logger.info("Type tea: green");
    }
    /**
     * This method describes logic setBlackTea
     */
    private void setBlackTea() {
        logger.info("Type tea: black");
    }
    /**
     * This method describes logic setСappuccinoCoffee
     */
    private void setСappuccinoCoffee() {
        logger.info("Type coffee: cappuccino");
    }
    /**
     * This method describes logic setAmericanoCoffee
     */
    private void setAmericanoCoffee() {
        logger.info("Type coffee: americano");
    }
}