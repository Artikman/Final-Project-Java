package com.saprika.multimodule.task2.chainsOfResponsibility;

import java.util.logging.Logger;

/**
 * Class describes model of DoesTheWarehouseWork
 * - implements – names of ChainsOfResponsibility.
 * @author – Artyom Sapryka.
 */
public class DoesTheWarehouseWork implements ChainsOfResponsibility {

    private final static Logger logger = Logger.getLogger(String.valueOf(DoesTheWarehouseWork.class));
    /**
     * This field contains information about chains
     */
    private ChainsOfResponsibility chains;
    /**
     * This method describes logic warehouseInspection
     *
     * @param nextChains – name of nextChains
     */
    public void warehouseInspection(ChainsOfResponsibility nextChains) {
        chains = nextChains;
    }
    /**
     * This method describes logic requestProcess
     *
     * @param value – name of value
     */
    public void requestProcess(Value value) {
        if(value.getValue()) {
            logger.info("Does the warehouse work: " + value.getValue());
        } else {
            chains.requestProcess(value);
        }
    }
}