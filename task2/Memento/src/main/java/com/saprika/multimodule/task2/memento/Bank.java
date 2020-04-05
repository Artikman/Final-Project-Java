package com.saprika.multimodule.task2.memento;
/**
 * Class describes model of Bank
 * @author – Artyom Sapryka.
 */
public class Bank {
    /**
     * This field contains information about save
     */
    private Save save;
    /**
     * This method describes logic getSave
     *
     * @return – describe return value.
     */
    public Save getSave() {
        return save;
    }
    /**
     * This method describes logic setSave
     *
     * @param save – name of save
     */
    public void setSave(Save save) {
        this.save = save;
    }
}