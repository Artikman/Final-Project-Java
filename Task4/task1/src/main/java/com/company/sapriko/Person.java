package com.company.sapriko;

/**
 * Class describes model of Person
 * @author – Artyom Sapriko.
 */
class Person {
    /**
     * This field contains information about height
     */
    private Integer height;
    /**
     * This field contains information about age
     */
    private Integer age;

    /**
     * This method describes logic getAge
     *
     * @return – describe return value.
     */
    Integer getAge() {
        return age;
    }

    /**
     * This method describes logic getHeight
     *
     * @return – describe return value.
     */
    Integer getHeight() {
        return height;
    }

    //constructor
    Person(Integer age, Integer height) {
        this.age = age;
        this.height = height;
    }
}