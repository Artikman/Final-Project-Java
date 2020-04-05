package com.saprika.multimodule.task2.abstractFactory;

/**
 * Class describes model of WoodWindows
 * - implements – names of Wood.
 * @author – Artyom Sapryka.
 */
class WoodWindowsGomel implements Wood {
    /**
     * This method describes logic getWoodTypes
     *
     * @return – describe return value.
     */
    public String getWoodTypes() {
        return "You choose wood Windows in the factory Gomel";
    }
}