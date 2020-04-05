package com.company.sapriko;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class StopPraga extends Thread {

    private final Logger logger = Logger.getLogger(StopPraga.class.getName());

    private Semaphore semaphore;

    private boolean full = false;

    private String tourist;
	
	private int photo;

    StopPraga(Semaphore semaphore, String tourist) {
        this.semaphore = semaphore;
        this.tourist = tourist;
    }
	
	private void takePhoto() {
		photo++;
	}

    public void run() {
        try {
            if(!full) {
                double a = 1 + Math.random() * 4;
                semaphore.acquire();
                logger.info(tourist + " турист пьет чешское пивко");

                logger.info("Время за которое пьет пиво данный турист: " + a);
                full = true;

                logger.info("Сфотографировал!");
				takePhoto();

                logger.info(tourist + " пошел обратно в автобус!");
                semaphore.release();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}