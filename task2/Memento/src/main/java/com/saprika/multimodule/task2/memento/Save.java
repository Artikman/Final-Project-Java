package com.saprika.multimodule.task2.memento;

import java.util.Date;
/**
 * Class describes model of Save
 * @author – Artyom Sapryka.
 */
class Save {
    /**
     * This field contains information about version
     */
    private final String version;
    /**
     * This field contains information about date
     */
    private final Date date;
    /**
     * constructor
     * @param version
     */
    Save(String version) {
        this.version = version;
        this.date = new Date();
    }
    /**
     * This method describes logic getVersion
     *
     * @return – describe return value.
     */
    String getVersion() {
        return version;
    }
    /**
     * This method describes logic getDate
     *
     * @return – describe return value.
     */
    Date getDate() {
        return date;
    }
}