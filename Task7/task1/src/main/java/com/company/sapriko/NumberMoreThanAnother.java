package com.company.sapriko;

import java.util.logging.Logger;

public class NumberMoreThanAnother implements MyConsumer {

    private final Logger logger = Logger.getLogger(NumbersFibonachi.class.getName());

    @Override
    public void accept(Integer value) {

        if(value > 10) {
            logger.info("True!");
        } else {
            logger.info("False!");
        }
    }
}