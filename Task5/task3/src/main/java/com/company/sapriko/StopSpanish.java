package com.company.sapriko;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

class StopSpanish extends Thread {

    private final Logger logger = Logger.getLogger(StopParis.class.getName());

    private String tourist;
	
	private int photo;

    StopSpanish(Semaphore semaphore3, String tourist) {
        this.tourist = tourist;
    }
	
	private void takePhoto() {
		photo++;
	}

    @Override
    public void run() {

        logger.info(tourist + "resting on the beach");

        try {
            Thread.sleep((int) (Math.random() * ((5000 - 1000) + 1)) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("Сфотографировал!");
		takePhoto();

        logger.info(tourist + "rested on the beach");
    }
}