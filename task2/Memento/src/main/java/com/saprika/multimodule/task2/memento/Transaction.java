package com.saprika.multimodule.task2.memento;

import java.util.Date;
/**
 * Class describes model of Transaction
 * @author – Artyom Sapryka.
 */
public class Transaction {
    /**
     * This field contains information about version
     */
    private String version;
    /**
     * This field contains information about date
     */
    private Date date;

    /**
     * constructor
     * @param version
     */
    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }
    /**
     * This method describes logic save
     *
     * @return – describe return value.
     */
    public Save save() {
        return new Save(version);
    }
    /**
     * This method describes logic load
     *
     * @param save – name of save
     */
    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }
    /**
     * This method describes logic toString
     *
     * @return – describe return value.
     */
    @Override
    public String toString() {
        return "Transaction\n" +
                "\nVersion: " + version +
                "\nDate: " + date + "\n";
    }
}