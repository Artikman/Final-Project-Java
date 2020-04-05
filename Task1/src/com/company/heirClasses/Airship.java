package com.company.heirClasses;

import com.company.abstractClass.Aircrafts;
import com.company.interfaces.AirshipImp;

/**
 * Class describes model of Airship
 * - extends – name of Aircrafts.
 * - implements – names of AirshipImp.
 * @author – Artyom Sapryka
 */
public class Airship extends Aircrafts implements AirshipImp {

    /**
     * This field contains information about typeOfAircraft
     */
    private String typeOfAircraft = "Airship";
    /**
     * This field contains information about maximumHeightAirship
     */
    private int maximumHeightAirship;
    /**
     * This field contains information about maximumSpeedAirship
     */
    private int maximumSpeedAirship;

    public Airship(String typeOfAircraft, int maximumHeightAirship, int maximumSpeedAirship)
    {
        super(typeOfAircraft);
        this.maximumHeightAirship = maximumHeightAirship;
        this.maximumSpeedAirship = maximumSpeedAirship;
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
     * This method describes logic getMaximumHeightAirship
     *
     * @return – describe return value.
     */
    public int getMaximumHeightAirship() { return maximumHeightAirship; }
    /**
     * This method describes logic setMaximumHeightAirship
     *
     * @param maximumHeightAirship – name of maximumHeightAirship
     */
    public void setMaximumHeightAirship(int maximumHeightAirship) { this.maximumHeightAirship = maximumHeightAirship; }
    /**
     * This method describes logic getMaximumSpeedAirship
     *
     * @return – describe return value.
     */
    public int getMaximumSpeedAirship() { return maximumSpeedAirship; }
    /**
     * This method describes logic setMaximumSpeedAirship
     *
     * @param maximumSpeedAirship – name of maximumSpeedAirship
     */
    public void setMaximumSpeedAirship(int maximumSpeedAirship) { this.maximumSpeedAirship = maximumSpeedAirship; }

    /**
     * This method describes logic flight
     */
    @Override
    public void flight()
    {
        System.out.println("Airship flies!");
    }

    /**
     * This method describes logic landing
     */
    @Override
    public void landing()
    {
        System.out.println("The airship lands!");
    }

    /**
     * This method describes logic calculationOfTheLiftingForceOfTheWing
     */
    public void calculationOfTheLiftingForceOfTheWing()
    {
        double liftingForce;
        final double liftCoefficient = 1.0033;
        final double airDensityAtAltitude = 1.225;
        double flowVelocity = 500;
        double characteristicArea = 1500;

        liftingForce = liftCoefficient * (((airDensityAtAltitude / flowVelocity * flowVelocity)) / 2) * characteristicArea;

        System.out.println("Aircraft wing lift = " + liftingForce);
    }

    /**
     * This method describes logic toString
     *
     * @return – describe return value.
     */
    @Override
    public String toString() {
        return new StringBuilder().append("Type of aircrafts: ").append(typeOfAircraft).append("\nMaximum flight altitude: ").append(maximumHeightAirship).append("\nMaximum speed: ").append(maximumSpeedAirship).append("\n").toString();
    }
}