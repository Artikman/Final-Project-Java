package com.saprika.multimodule.task2.facade;

import java.util.logging.Logger;
/**
 * Class describes model of PackUp
 * @author – Artyom Sapryka
 */
class PackUp {

    private final static Logger logger = Logger.getLogger(String.valueOf(PackUp.class));
    /**
     * This method describes logic packUp
     */
    void packUp() {
        logger.info("Pack up");
    }
}