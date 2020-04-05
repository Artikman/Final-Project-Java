package com.company.sapriko;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

class ExchangeOffice extends Thread {

    private static final Logger logger = Logger.getLogger(ExchangeOffice.class.getName());

    private static float exchangeRates = 2.1f;

    static boolean isActiveStatus = true;

    private volatile boolean shutdown;

    private static Queue<Thread> queueExchangeOffice = new LinkedList<>();

    static float getExchangeRates() {
        return exchangeRates;
    }

    private synchronized void updateExchangeRates() {
        exchangeRates = (float) (Math.random() * ((2.3f - 2.1f) + 1)) + 2.1f;
    }

    static void changeStatus() {
        isActiveStatus = !isActiveStatus;
    }

    static synchronized void exchangeOffice(Thread tourist, int value) {

        if(queueExchangeOffice.size() <= 5) {

            isActiveStatus = !isActiveStatus;

            queueExchangeOffice.add(tourist);

            float result = value * exchangeRates;

            logger.info(((Tourist) tourist).getNameTourist() + " exchanged USD " + value + " to " + result);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queueExchangeOffice.remove(tourist);
        }
    }

    @Override
    public void run() {
        while(!shutdown) {
            try {
                updateExchangeRates();
                logger.info("Exchange USD/BYN : " + getExchangeRates());
                CurrencyExchange.updateExchangeRates();
                Thread.sleep( (int) (Math.random() * ((10000 - 5000) + 1)) + 5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void stopExchangeOffice() {
        shutdown = true;
    }
}