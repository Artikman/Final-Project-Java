package com.saprika.multimodule.task2.abstractFactory;

/**
 * Class describes model of WindowManufacturingFactoryGomel
 * - implements – names of WindowsFactory.
 * @author – Artyom Sapryka.
 */
public class WindowManufacturingFactoryGomel implements WindowsFactory {
    /**
     * This method describes logic getWoodTypes
     *
     * @return – describe return value.
     */
    public Wood getWoodTypes() {
        return new WoodWindowsGomel();
    }
    /**
     * This method describes logic getSpecialTypes
     *
     * @return – describe return value.
     */
    public Special getSpecialTypes() {
        return new SpecialWindowsGomel();
    }
    /**
     * This method describes logic getPlasticTypes
     *
     * @return – describe return value.
     */
    public Plastic getPlasticTypes() {
        return new PlasticWindowsGomel();
    }
}