package com.saprika.multimodule.task2.abstractFactory;

/**
 * Class describes model of SpecialWindows
 * - implements – names of Special.
 * @author – Artyom Sapryka.
 */
public class SpecialWindowsMinsk implements Special {
    /**
     * This method describes logic getSpecialTypes
     *
     * @return – describe return value.
     */
    public String getSpecialTypes() {
        return "You have selected a special window in the factory of Minsk";
    }
}