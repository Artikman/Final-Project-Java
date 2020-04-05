package com.company.sapriko;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.KeyException;

public class RunnerTest {

    @Before
    public void testValidateRegister() {
        ValidationSystem.Register(Integer.class, new IntegerValidator(1, 10, 15, 30));
        ValidationSystem.Register(String.class, new StringLengthValidator(12, "^[A-Z][^!?@#$%^&*()_][^0-9]*$"));
        ValidationSystem.Register(Person.class, new PersonValidator(16, 160));
    }

    @Test
    public void testValidateInt() throws ValidationFailedException, NullPointerException, KeyException {
        ValidationSystem.validate(25);
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateIntFails() throws ValidationFailedException, KeyException, NullPointerException {
        ValidationSystem.validate(12);
    }

    @Test(expected = ValidationFailedException.class)
    public void testValidateStringFails() throws ValidationFailedException, KeyException, NullPointerException {
        ValidationSystem.validate("hello");
    }

    @Test
    public void testValidatePerson() throws ValidationFailedException, KeyException, NullPointerException {
        Integer age = 20;
        Integer height = 180;
        Person artem = new Person(age, height);
        Assert.assertEquals(artem.getAge(), age);
        Assert.assertEquals(artem.getHeight(), height);
        ValidationSystem.validate(artem);
    }
}