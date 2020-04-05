package com.saprika.multimodule.task2.decorator;

import java.util.logging.Logger;
/**
 * Class describes model of Coffee
 * - implements – names of Cafe.
 * @author – Artyom Sapryka.
 */
public class Coffee implements Cafe {

    private final static Logger logger = Logger.getLogger(String.valueOf(Coffee.class));
    /**
     * This method describes logic toSubmitAnOrder
     */
    public void toSubmitAnOrder() {
        logger.info("Coffee");
    }
    /**
     * This method describes logic costCalculationCappuccinoCoffee
     */
    public void costCalculationCappuccinoCoffee() {

        int cappuccinoCoffeeWithAdditive = 250;

        int costCoffee = 500;

        int costCalculation = costCoffee + cappuccinoCoffeeWithAdditive;

        logger.info("cappuccino coffee price: " + costCalculation);

    }
    /**
     * This method describes logic costCalculationAmericanoCoffee
     */
    public void costCalculationAmericanoCoffee() {

        int americanoCoffeeWithAdditive = 350;

        int costCoffee = 500;

        int costCalculation = costCoffee + americanoCoffeeWithAdditive;

        logger.info("americano coffee price: " + costCalculation);
    }
}