package com.company.sapriko;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

class ExchangeOffice extends Thread {

    private static final Logger logger = Logger.getLogger(ExchangeOffice.class.getName());

    private static Lock lock = new ReentrantLock();

    private static float exchangeRates = 2.1f;

    static boolean isActiveStatus = true;

    private volatile boolean shutdown;

    private static BlockingQueue<Thread> queueExchangeOffice = new LinkedBlockingQueue<>(5);

    static float getExchangeRates() {
        return exchangeRates;
    }

    private void updateExchangeRates() {
        exchangeRates = (float) (Math.random() * ((2.3f - 2.1f) + 1)) + 2.1f;
    }

    static void changeStatus() {
        isActiveStatus = !isActiveStatus;
    }

    static void exchangeOffice(Thread tourist, int value) {

        isActiveStatus = !isActiveStatus;

        try {
            queueExchangeOffice.put(tourist);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        float result = value * exchangeRates;
        logger.info(((Tourist)tourist).getNameTourist() + " exchanged USD [" + value + "] to " + result);

        try {
            queueExchangeOffice.take();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(!shutdown) {
            try {
                updateExchangeRates();
                logger.info(" " + getExchangeRates());
                CurrencyExchange.updateExchangeRates();
                lock.lock();
                Thread.sleep( (int) (Math.random() * ((10000 - 5000) + 1)) + 5000);
                lock.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void stopExchangeOffice() {
        shutdown = true;
    }
}