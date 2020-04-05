package com.saprika.multimodule.task2.facade;

import java.util.logging.Logger;
/**
 * Class describes model of ToDeliverToTheStore
 * @author – Artyom Sapryka
 */
class ToDeliverToTheStore {

    private final static Logger logger = Logger.getLogger(String.valueOf(ToDeliverToTheStore.class));
    /**
     * This method describes logic toDeliverToTheStore
     */
    void toDeliverToTheStore() {
        logger.info("To deliver to the store");
    }
}