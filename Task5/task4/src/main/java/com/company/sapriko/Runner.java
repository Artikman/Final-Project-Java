package com.company.sapriko;

import java.util.Date;
import java.util.logging.Logger;

public class Runner
{
    public static void main( String[] args )
    {

        final Logger logger = Logger.getLogger(Runner.class.getName());

        long startTime = new Date().getTime();

        long result = showTotalAmount();

        long stopTime = new Date().getTime();
        logger.info(String.valueOf(result));
        logger.info("Was computed in " + (stopTime - startTime) + " milliseconds.");

        long startTime1 = new Date().getTime();
        logger.info(String.valueOf(ForkJoinAdd.run()));
        long stopTime1 = new Date().getTime();
        logger.info("Was computed in " + (stopTime1 - startTime1) + " milliseconds.");
    }

    private static long showTotalAmount() {
        long result = 0;
        for (long i = 0; i <= 1_000_000_000; i++) {
            result += i;
        }
        return result;
    }
}