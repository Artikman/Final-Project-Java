package com.saprika.multimodule.task2.facade;

import java.util.logging.Logger;
/**
 * Class describes model of ToMakePayment
 * @author – Artyom Sapryka
 */
class ToMakePayment {

    private final static Logger logger = Logger.getLogger(String.valueOf(ToMakePayment.class));
    /**
     * This method describes logic toMakePayment
     */
    void toMakePayment() {
        logger.info("To make a payment");
    }
}