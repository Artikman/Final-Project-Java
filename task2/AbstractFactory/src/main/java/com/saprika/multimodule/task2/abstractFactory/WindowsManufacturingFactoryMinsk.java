package com.saprika.multimodule.task2.abstractFactory;

/**
 * Class describes model of WindowsManufacturingFactoryMinsk
 * - implements – names of WindowsFactory.
 * @author – Artyom Sapryka.
 */
public class WindowsManufacturingFactoryMinsk implements WindowsFactory {
    /**
     * This method describes logic getWoodTypes
     *
     * @return – describe return value.
     */
    public Wood getWoodTypes() {
        return new WoodWindowsMinsk();
    }
    /**
     * This method describes logic getSpecialTypes
     *
     * @return – describe return value.
     */
    public Special getSpecialTypes() {
        return new SpecialWindowsMinsk();
    }
    /**
     * This method describes logic getPlasticTypes
     *
     * @return – describe return value.
     */
    public Plastic getPlasticTypes() {
        return new PlasticWindowsMinsk();
    }
}