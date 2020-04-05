package com.company.sapriko;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;
import java.util.logging.Logger;

class Tourist implements Runnable {

    private static final Logger logger = Logger.getLogger(Tourist.class.getName());

    private Exchanger<Integer> exchanger;

    private Phaser phaser;
    private int photoCounter = 0;
    private boolean isInTravel = false;
    private String name;

    Tourist(String name, Phaser phaser, Exchanger<Integer> exchanger) {
        this.name = name;
        this.phaser = phaser;
        this.exchanger = exchanger;

        phaser.register();

    }

    private String getName() {
        return name;
    }

    private void useCloud() {

        try {
            photoCounter = exchanger.exchange(photoCounter);
            logger.info(getName() + "has updated cloud");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        isInTravel = true;

        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        phaser.arriveAndAwaitAdvance();

        useCloud();
    }
}