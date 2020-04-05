package com.epam.sapryka;

import com.epam.sapryka.Aircrafts;
import com.epam.sapryka.HelicopterImp;

/**
 * Class describes model of Helicopter
 * - extends – name of Aircrafts.
 * - implements – names of HelicopterImp.
 * @author – Artyom Sapryka.
 */
public class Helicopter extends Aircrafts implements HelicopterImp {

    /**
     * This field contains information about typeOfAircraft
     */
    private String typeOfAircraft = "Helicopter";
    /**
     * This field contains information about maximumHeightHelicopter
     */
    private int maximumHeightHelicopter;
    /**
     * This field contains information about maximumSpeedHelicopter
     */
    private int maximumSpeedHelicopter;

    public Helicopter(String typeOfAircraft, int maximumHeightHelicopter, int maximumSpeedHelicopter)
    {
        super(typeOfAircraft);
        this.maximumHeightHelicopter = maximumHeightHelicopter;
        this.maximumSpeedHelicopter = maximumSpeedHelicopter;
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
     * This method describes logic getMaximumHeightHelicopter
     *
     * @return – describe return value.
     */
    public int getMaximumHeightHelicopter() { return maximumHeightHelicopter; }
    /**
     * This method describes logic setMaximumHeightHelicopter
     *
     * @param maximumHeightHelicopter – name of maximumHeightHelicopter
     */
    public void setMaximumHeightHelicopter(int maximumHeightHelicopter) { this.maximumHeightHelicopter = maximumHeightHelicopter; }
    /**
     * This method describes logic getMaximumSpeedHelicopter
     *
     * @return – describe return value.
     */
    public int getMaximumSpeedHelicopter() { return maximumSpeedHelicopter; }
    /**
     * This method describes logic setMaximumSpeedHelicopter
     *
     * @param maximumSpeedHelicopter – name of maximumSpeedHelicopter
     */
    public void setMaximumSpeedHelicopter(int maximumSpeedHelicopter) { this.maximumSpeedHelicopter = maximumSpeedHelicopter; }

    /**
     * This method describes logic flight
     */
    @Override
    public void flight() {
        System.out.println("Helicopter flies!");
    }

    /**
     * This method describes logic landing
     */
    @Override
    public void landing() {
        System.out.println("The helicopter landed!");
    }

    /**
     * This method describes logic theFallHelicopter
     */
    public void theFallHelicopter()
    {
        System.out.println("The helicopter crashed!");
    }

    /**
     * This method describes logic toString
     *
     * @return – describe return value.
     */
    @Override
    public String toString() {
        return new StringBuilder().append("Type of aircrafts: ").append(typeOfAircraft).append("\nMaximum flight altitude: ").append(maximumHeightHelicopter).append("\nMaximum speed: ").append(maximumSpeedHelicopter).append("\n").toString();
    }
}