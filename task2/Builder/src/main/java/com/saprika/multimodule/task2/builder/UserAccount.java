package com.saprika.multimodule.task2.builder;
/**
 * Class describes model of UserAccount
 * @author – Artyom Sapryka.
 */
public class UserAccount {
    /**
     * This field contains information about userBuilder
     */
    private UserBuilder userBuilder;
    /**
     * This method describes logic setUserBuilder
     *
     * @param userBuilder – name of userBuilder
     */
    public void setUserBuilder(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }
    /**
     * This method describes logic getUser
     *
     * @return – describe return value.
     */
    public User getUser() {
        return userBuilder.getUser();
    }
    /**
     * This method describes logic constructUser
     */
    public void constructUser() {
        userBuilder.createNewUser();
        userBuilder.buildLastName();
        userBuilder.buildFirstName();
        userBuilder.buildMiddleName();
        userBuilder.buildStreetAddress();
        userBuilder.buildCity();
        userBuilder.buildState();
    }
}