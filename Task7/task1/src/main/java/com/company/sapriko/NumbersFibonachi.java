package com.company.sapriko;

import java.util.logging.Logger;

public class NumbersFibonachi implements MyConsumer {

    private final Logger logger = Logger.getLogger(NumbersFibonachi.class.getName());

    @Override
    public void accept(Integer value) {
        int f = 0;
        int g = 1;
        int temp = 0;
        boolean isPrime = true;
        int largeNum = -1;

        for(int i = 0; i < value; i++)
        {
            if(i == (value-1))
                largeNum = f;
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            logger.info(value + " - Число Фибоначчи!");
        } else {
            logger.info(value + " - Не является числом Фибоначчи!");
        }

    }
}