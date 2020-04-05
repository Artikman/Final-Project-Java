package com.company.sapriko;

import java.util.logging.Logger;

class Tourist extends Thread {

    private static final Logger logger = Logger.getLogger(Tourist.class.getName());

    private String name;

    Tourist(String name) {
        this.name = name;
    }


    String getNameTourist() {
        return name;
    }

    @Override
    public void run() {
        learnsTheExchangeRate((int) (Math.random() * ((1000 - 100) + 1) + 100));
    }

    private void learnsTheExchangeRate(int value) {
        if(value >= 100 && value  <= 1000) {
            if(ExchangeOffice.isActiveStatus) {
                ExchangeOffice.exchangeOffice(this, value);
            } else {
                ExchangeOffice.changeStatus();
                CurrencyExchange.currencyExchange(this, value);
            }
        } else {
            logger.info("Wrong amount of money entered ");
        }
    }
}