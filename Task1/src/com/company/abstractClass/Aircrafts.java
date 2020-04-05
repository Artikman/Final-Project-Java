package com.company.abstractClass;

/**
 * Class describes model of Aircrafts
 * @author – Artyom Sapryka
 */
public abstract class Aircrafts {

    /**
     * This field contains information about typeOfAircraft
     */
    private String typeOfAircraft;

    public Aircrafts(String typeOfAircraft)
    {
        this.typeOfAircraft = typeOfAircraft;
    }

    /**
     * This method describes logic flight
     */
    public abstract void flight();

    /**
     * This method describes logic landing
     */
    public abstract void landing();

    /**
     * This method describes logic getTypeOfAircraft
     *
     * @return – describe return value.
     */
    public String getTypeOfAircraft()
    {
        return typeOfAircraft;
    }

    /**
     * This method describes logic setTypeOfAircraft
     *
     * @param typeOfAircraft – name of typeOfAircraft
     */
    public void setTypeOfAircraft(String typeOfAircraft)
    {
        this.typeOfAircraft = typeOfAircraft;
    }
}