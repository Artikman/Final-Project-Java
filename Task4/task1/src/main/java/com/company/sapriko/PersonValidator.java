package com.company.sapriko;

/**
 * Class describes model of PersonValidator
 * - implements – names of IValidator.
 * @author – Artyom Sapriko.
 */
public class PersonValidator implements IValidator<Person> {

    /**
     * This field contains information about minAge
     */
    private Integer minAge;
    /**
     * This field contains information about minHeight
     */
    private Integer minHeight;

    /**
     * This method describes logic getMinAge
     *
     * @return – describe return value.
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * This method describes logic getMinHeight
     *
     * @return – describe return value.
     */
    public Integer getMinHeight() {
        return minHeight;
    }

    //constructor
    PersonValidator(Integer minAge, Integer minHeight) {
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    /**
     * This method describes logic validate
     *
     * @param person – name of person
     * @return – describe return value.
     */
    public boolean validate(Person person) {
        return (person.getAge() >= minAge && person.getHeight() >= minHeight);
    }
}