package com.company.sapriko;

import java.security.KeyException;

/**
 * Class describes model of Runner
 * @author – Artyom Sapriko.
 */
public class Runner {
    public static void main(String[] args) {

        ValidationSystem.Register(Integer.class, new IntegerValidator(1, 10, 15, 30));
        ValidationSystem.Register(String.class, new StringLengthValidator(12, "^[A-Z][^!?@#$%^&*()_][^0-9]*$"));
        ValidationSystem.Register(Person.class, new PersonValidator(16, 160));

        try
        {
            System.out.println(ValidationSystem.validate(25));
        }
        catch (ValidationFailedException | KeyException | NullPointerException e )
        {
            System.out.println("Not valid");
        }

        try
        {
            System.out.println(ValidationSystem.validate("Hello"));
        }
        catch (ValidationFailedException | KeyException | NullPointerException e)
        {
            System.out.println("Not valid");
        }
        Person artem = new Person(20 , 180);
        try
        {
            System.out.println(ValidationSystem.validate(artem));
        }
        catch (ValidationFailedException | KeyException | NullPointerException e)
        {
            System.out.println("Not valid");
        }
    }
}