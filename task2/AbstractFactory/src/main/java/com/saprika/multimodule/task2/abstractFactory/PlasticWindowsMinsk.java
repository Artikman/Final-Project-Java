package com.saprika.multimodule.task2.abstractFactory;

/**
 * Class describes model of PlasticWindows
 * - implements – names of Plastic.
 * @author – Artyom Sapryka.
 */
class PlasticWindowsMinsk implements Plastic {
    /**
     * This method describes logic getPlasticTypes
     *
     * @return – describe return value.
     */
    public String getPlasticTypes() {
        return "You choose a plastic window in the factory Minsk";
    }
}