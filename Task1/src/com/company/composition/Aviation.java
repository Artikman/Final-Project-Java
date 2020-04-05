package com.company.composition;

/**
 * Class describes model of Aviation
 * @author – Artyom Sapryka.
 */
public class Aviation {

    Screw screw = new Screw();

    /**
     * This method describes logic on
     */
    public void on()
    {
        System.out.println("This method is activated!");
    }

    /**
     * This method describes logic job
     */
    public void job()
    {
        System.out.println("This method work!");
        screw.work();
        screw.stops();
    }

    /**
     * This method describes logic off
     */
    public void off()
    {
        System.out.println("This method turned off!");
    }
}