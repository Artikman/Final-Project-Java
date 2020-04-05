package com.saprika.multimodule.task2.builder;
/**
 * Class describes model of UserBuilder
 * @author – Artyom Sapryka.
 */
public abstract class UserBuilder {
    /**
     * This field contains information about user
     */
    protected User user;
    /**
     * This method describes logic getUser
     *
     * @return – describe return value.
     */
    public User getUser() {
        return user;
    }
    /**
     * This field contains information about createNewUser
     */
    public void createNewUser() {
        user = new User();
    }
    /**
     * This field contains information about buildLastName
     */
    public abstract void buildLastName();
    /**
     * This field contains information about buildFirstName
     */
    public abstract void buildFirstName();
    /**
     * This field contains information about buildMiddleName
     */
    public abstract void buildMiddleName();
    /**
     * This field contains information about buildStreetAddress
     */
    public abstract void buildStreetAddress();
    /**
     * This field contains information about buildCity
     */
    public abstract void buildCity();
    /**
     * This field contains information about buildState
     */
    public abstract void buildState();
}