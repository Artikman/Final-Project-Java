package com.company.sapriko;

import java.util.concurrent.Exchanger;
import java.util.logging.Logger;

class PhotoCloud implements Runnable {

    private final Logger logger = Logger.getLogger(StopParis.class.getName());

    private Exchanger<Integer> exchanger;

    private int photoSum;

    private boolean shutdown;

    PhotoCloud(Exchanger<Integer> exchanger) {

        this.exchanger = exchanger;
    }

    void outputSum() {

        logger.info("Sum of photos is : " + photoSum);
    }

    @Override
    public void run() {

        while(!shutdown)

            try {
                this.photoSum = this.photoSum + exchanger.exchange(photoSum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    void stop() {

        this.shutdown = true;
    }
}