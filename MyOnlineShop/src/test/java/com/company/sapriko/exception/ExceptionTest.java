package com.company.sapriko.exception;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExceptionTest {

    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting package \"Exception\" - START.\n");
    }

    @AfterClass
    public static void teatDown() {
        System.out.println("\nTesting package \"Exception\" - FINISH.\n");
    }

    @Test
    public void OrderProductExceptionTest() throws Exception {
        System.out.println("-> OrderNotFountException, ProductNotFoundException() - ");

        checkException(new OrderNotFoundException(), "");
        checkException(new ProductNotFoundException(), "");

        String message = "MESSAGE";
        OrderNotFoundException ex = new OrderNotFoundException(message);
        ProductNotFoundException ex1 = new ProductNotFoundException(message);

        checkException(ex, message);
        checkException(ex1, message);

        System.out.println("OK!");
    }

    @Ignore
    public static void checkException(Exception ex, String message) {
        assertNotNull(ex);
        if(!message.isEmpty()) {
            assertEquals(ex.getMessage(), message);
        }
    }
}