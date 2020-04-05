package com.company.sapriko;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

class CurrencyExchange extends Thread {

    private static final Logger logger = Logger.getLogger(ExchangeOffice.class.getName());

    private static float exchangeRates = 2.1f;

    private static boolean isActiveStatus = true;

    private volatile boolean shutdown;

    private static Queue<Thread> queueExchangeOffice = new LinkedList<>();

    private static float getExchangeRates() {
        return exchangeRates;
    }

    static synchronized void updateExchangeRates() {
        exchangeRates = ExchangeOffice.getExchangeRates() - ((ExchangeOffice.getExchangeRates() * 5) / 100);
        CurrencyExchange.logger.info(String.valueOf(getExchangeRates()));
    }

    static synchronized void currencyExchange(Thread tourist, int value) {

        isActiveStatus = !isActiveStatus;

        queueExchangeOffice.add(tourist);

        float result = value * exchangeRates;
        logger.info(((Tourist)tourist).getNameTourist() + " exchanged USD [" + value + "] to " + result);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        queueExchangeOffice.remove(tourist);
    }

    public void run() {
        while(!shutdown) {
            logger.info("Exchange USD/BYN : " + getExchangeRates());
        }
    }

    void stopCurrencyExchange() {
        shutdown = true;
    }
}