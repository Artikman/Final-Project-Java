package com.saprika.multimodule.task2.facade;

import java.util.logging.Logger;
/**
 * Class describes model of DeliverToBuyer
 * @author – Artyom Sapryka
 */
class GoToTheWarehouse {

    private final static Logger logger = Logger.getLogger(String.valueOf(GoToTheWarehouse.class));
    /**
     * This method describes logic goToTheWarehouse
     */
    void goToTheWarehouse() {
        logger.info("Go to the warehouse");
    }
}