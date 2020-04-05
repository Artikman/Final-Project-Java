package com.company.sapriko;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class StopParis extends Thread {

    private final Logger logger = Logger.getLogger(StopParis.class.getName());

    private Semaphore semaphore;

    private boolean full = false;

    private String tourist;
	
	private int photo;
	

    StopParis(Semaphore semaphore, String tourist) {
        this.semaphore = semaphore;
        this.tourist = tourist;
    }
	
	private void takePhoto() {
		photo++;
	}

    public void run() {
        try {
            if(!full) {
                semaphore.acquire();
                logger.info(tourist + " смотрит улыбку Джаконды!");

                sleep(1000);
                full = true;

                logger.info("Сфотографировал!");
				takePhoto();

                logger.info(tourist + " Пошел обратно в автобус!");
                semaphore.release();

                sleep(1000);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}