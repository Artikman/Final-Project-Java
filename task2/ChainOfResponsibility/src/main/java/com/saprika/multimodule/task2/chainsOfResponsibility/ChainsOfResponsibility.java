package com.saprika.multimodule.task2.chainsOfResponsibility;
/**
 * Interface describes model of ChainsOfResponsibility
 * @author – Artyom Sapryka.
 */
public interface ChainsOfResponsibility {
    /**
     * This method describes logic warehouseInspection
     *
     * @param nextChains – name of nextChains
     */
    void warehouseInspection(ChainsOfResponsibility nextChains);
    /**
     * This method describes logic requestProcess
     *
     * @param value – name of value
     */
    void requestProcess(Value value);
}