package com.company.sapriko;

import java.util.logging.Logger;

public class SimpleNumber implements MyConsumer {

    private final Logger logger = Logger.getLogger(SimpleNumber.class.getName());

    @Override
    public void accept(Integer value) {
        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= value /2; i++) {
            temp = value % i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            logger.info(value + " - простое число!");
        } else {
            logger.info(value + " - составное число!");
        }

    }
}