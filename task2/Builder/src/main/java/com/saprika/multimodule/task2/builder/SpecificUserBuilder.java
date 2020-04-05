package com.saprika.multimodule.task2.builder;
/**
 * Class describes model of SpecificUserBuilder
 * - extends – name of UserBuilder.
 * @author – Artyom Sapryka.
 */
public class SpecificUserBuilder extends UserBuilder {
    /**
     * This method describes logic buildLastName
     */
    public void buildLastName() {
        user.setLastName();
    }
    /**
     * This method describes logic buildFirstName
     */
    public void buildFirstName() {
        user.setFirstName();
    }
    /**
     * This method describes logic buildMiddleName
     */
    public void buildMiddleName() {
        user.setMiddleName();
    }
    /**
     * This method describes logic buildStreetAddress
     */
    public void buildStreetAddress() {
        user.setStreetAddress();
    }
    /**
     * This method describes logic buildCity
     */
    public void buildCity() {
        user.setCity();
    }
    /**
     * This method describes logic buildState
     */
    public void buildState() {
        user.setState();
    }
}