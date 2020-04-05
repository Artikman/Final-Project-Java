package com.company.heirClasses;

import com.company.abstractClass.Aircrafts;

/**
 * Class describes model of Plane
 * - extends – name of Aircrafts.
 * @author – Artyom Sapryka.
 */
public class Plane extends Aircrafts {

    /**
     * This field contains information about typeOfAircraft
     */
    private String typeOfAircraft = "Plane";
    /**
     * This field contains information about maximumHeightPlane
     */
    private int maximumHeightPlane;
    /**
     * This field contains information about maximumSpeedPlane
     */
    private int maximumSpeedPlane;

    public Plane(String typeOfAircraft, int maximumHeightPlane, int maximumSpeedPlane)
    {
        super(typeOfAircraft);
        this.maximumHeightPlane = maximumHeightPlane;
        this.maximumSpeedPlane = maximumSpeedPlane;
    }

    /**
     * This method describes logic getTypeOfAircraft
     *
     * @return – describe return value.
     */
    public String getTypeOfAircraft() { return typeOfAircraft; }

    /**
     * This method describes logic setTypeOfAircraft
     *
     * @param typeOfAircraft – name of typeOfAircraft
     */
    public void setTypeOfAircraft(String typeOfAircraft) { this.typeOfAircraft = typeOfAircraft; }

    /**
     * This method describes logic getMaximumHeightPlane
     *
     * @return – describe return value.
     */
    public int getMaximumHeightPlane() { return maximumHeightPlane; }

    /**
     * This method describes logic setMaximumHeightPlane
     *
     * @param maximumHeightPlane – name of maximumHeightPlane
     */
    public void setMaximumHeightPlane(int maximumHeightPlane) { this.maximumHeightPlane = maximumHeightPlane; }

    /**
     * This method describes logic getMaximumSpeedPlane
     *
     * @return – describe return value.
     */
    public int getMaximumSpeedPlane() { return maximumSpeedPlane; }

    /**
     * This method describes logic setMaximumSpeedPlane
     *
     * @param maximumSpeedPlane – name of maximumSpeedPlane
     */
    public void setMaximumSpeedPlane(int maximumSpeedPlane) { this.maximumSpeedPlane = maximumSpeedPlane; }

    /**
     * This method describes logic flight
     */
    @Override
    public void flight() {
        System.out.println("The plane is flying!");
    }

    /**
     * This method describes logic landing
     */
    @Override
    public void landing() {
        System.out.println("The plane has landed!");
    }

    /**
     * This method describes logic toString
     *
     * @return – describe return value.
     */
    @Override
    public String toString() {
        return new StringBuilder().append("Type of aircrafts: ").append(typeOfAircraft).append("\nMaximum flight altitude: ").append(maximumHeightPlane).append("\nMaximum speed: ").append(maximumSpeedPlane).append("\n").toString();
    }
}