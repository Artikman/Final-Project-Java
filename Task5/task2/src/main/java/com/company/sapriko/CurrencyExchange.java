package com.company.sapriko;

import java.util.concurrent.*;
import java.util.logging.Logger;

class CurrencyExchange extends Thread {

    private static final Logger logger = Logger.getLogger(CurrencyExchange.class.getName());

    private static float exchangeRates = 2.1f;

    private static boolean isActiveStatus = true;

    private volatile boolean shutdown;

    private static BlockingQueue<Thread> queueCurrencyExchange = new LinkedBlockingQueue<>();

    private static float getExchangeRates() {
        return exchangeRates;
    }

    static void updateExchangeRates() {
        exchangeRates = ExchangeOffice.getExchangeRates() - ((ExchangeOffice.getExchangeRates() * 5) / 100);
        CurrencyExchange.logger.info(String.valueOf(getExchangeRates()));
    }

    static void currencyExchange(Thread tourist, int value) {

        try {
            queueCurrencyExchange.put(tourist);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isActiveStatus = !isActiveStatus;

        float result = value * exchangeRates;
        logger.info(((Tourist)tourist).getNameTourist() + " exchanged USD [" + value + "] to " + result);

        try {
            queueCurrencyExchange.take();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(!shutdown) {
            logger.info(" Exchange USD/BYN : " + getExchangeRates());
        }
    }

    void stopCurrencyExchange() {
        shutdown = true;
    }
}