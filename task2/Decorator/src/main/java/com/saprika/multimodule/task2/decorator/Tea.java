package com.saprika.multimodule.task2.decorator;

import java.util.logging.Logger;
/**
 * Class describes model of Tea
 * - implements – names of Cafe.
 * @author – Artyom Sapryka.
 */
public class Tea implements Cafe {

    private final static Logger logger = Logger.getLogger(String.valueOf(Tea.class));
    /**
     * This method describes logic toSubmitAnOrder
     */
    public void toSubmitAnOrder() {
        logger.info("Tea");
    }
    /**
     * This method describes logic costCalculationGreenTea
     */
    public void costCalculationGreenTea() {

        int greenTeaWithAdditive = 25;

        int costTea = 250;

        int costCalculation = costTea + greenTeaWithAdditive;

        logger.info("green tea price: " + costCalculation);
    }
    /**
     * This method describes logic costCalculationBlackTea
     */
    public void costCalculationBlackTea() {

        int blackTeaWithAdditive = 15;

        int costTea = 250;

        int costCalculation = costTea + blackTeaWithAdditive;

        logger.info("black tea price: " + costCalculation);
    }
}