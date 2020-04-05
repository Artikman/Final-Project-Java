package com.saprika.multimodule.task2.facade;

import java.util.logging.Logger;
/**
 * Class describes model of DeliverToBuyer
 * @author – Artyom Sapryka
 */
class DeliverToBuyer {

    private final static Logger logger = Logger.getLogger(String.valueOf(DeliverToBuyer.class));
    /**
     * This method describes logic deliverToBuyer
     */
    void deliverToBuyer() {
        logger.info("Deliver to buyer");
    }
}