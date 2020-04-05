package com.company.sapriko;

import java.util.logging.Logger;

public class Runner
{
    public static void main( String[] args ) {

        final Logger logger = Logger.getLogger(Runner.class.getName());

        ExchangeOffice exchangeOffice = new ExchangeOffice();
        CurrencyExchange currencyExchange = new CurrencyExchange();

        exchangeOffice.start();
        logger.info("Starting ExchangeOffice!");

        currencyExchange.start();
        logger.info("Starting CurrencyExchange!");

        for(int i = 0; i <= 25; i++) {
            Tourist tourist = new Tourist("Tourist № " + i);
            tourist.start();
        }

        currencyExchange.stopCurrencyExchange();
        exchangeOffice.stopExchangeOffice();
    }
}