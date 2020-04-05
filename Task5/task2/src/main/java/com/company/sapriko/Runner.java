package com.company.sapriko;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Runner
{
    public static void main( String[] args )
    {

        ExecutorService exec = Executors.newFixedThreadPool(20);

        final Logger logger = Logger.getLogger(Runner.class.getName());

        ExchangeOffice exchangeOffice = new ExchangeOffice();

        exchangeOffice.start();
        logger.info("Starting ExchangeOffice Concurrent!");

        CurrencyExchange currencyExchange = new CurrencyExchange();

        currencyExchange.start();
        logger.info("Starting CurrencyExchange Concurrent!");

        for(int i = 0; i <= 20; i++) {
            Tourist tourist = new Tourist("Tourist № " + i);
            tourist.start();
        }

        currencyExchange.stopCurrencyExchange();
        exchangeOffice.stopExchangeOffice();

        exec.shutdown();
    }
}