package com.saprika.multimodule.task2.abstractFactory;

/**
 * Interface describes model of WindowsFactory
 * @author – Artyom Sapryka.
 */
public interface WindowsFactory {
    /**
     * This method describes logic getWoodTypes
     */
    Wood getWoodTypes();
    /**
     * This method describes logic getSpecialTypes
     */
    Special getSpecialTypes();
    /**
     * This method describes logic getPlasticTypes
     */
    Plastic getPlasticTypes();
}