package com.saprika.multimodule.task2.builder;
/**
 * Class describes model of User
 * @author – Artyom Sapryka.
 */
public class User {
    /**
     * This field contains information about lastName
     */
    private String lastName = null;
    /**
     * This field contains information about firstName
     */
    private String firstName = null;
    /**
     * This field contains information about middleName
     */
    private String middleName = null;
    /**
     * This field contains information about streetAddress
     */
    private String streetAddress = null;
    /**
     * This field contains information about city
     */
    private String city = null;
    /**
     * This field contains information about state
     */
    private String state = null;
    /**
     * This method describes logic setLastName
     */
    void setLastName() {
        this.lastName = "Sapryka";
    }
    /**
     * This method describes logic setFirstName
     */
    void setFirstName() {
        this.firstName = "Artyom";
    }
    /**
     * This method describes logic setMiddleName
     */
    void setMiddleName() {
        this.middleName = "Aleksandrovich";
    }
    /**
     * This method describes logic setStreetAddress
     */
    void setStreetAddress() {
        this.streetAddress = "Komsomolskya";
    }
    /**
     * This method describes logic setCity
     */
    void setCity() {
        this.city = "Kalinkovichi";
    }
    /**
     * This method describes logic setState
     */
    void setState() {
        this.state = "Belarus";
    }
}