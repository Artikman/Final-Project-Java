package com.company.sapriko;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

class StopRome extends Thread {

    private static final Logger logger = Logger.getLogger(StopRome.class.getName());

    private final String tourist;

    private Semaphore semaphore;

    private boolean full = false;

    private static BlockingQueue<Runnable> evenQueue = new LinkedBlockingQueue<>(5);
    private static BlockingQueue<Runnable> notEvenQueue = new LinkedBlockingQueue<>(5);
	
	private int photo;

    StopRome(Semaphore semaphore, String tourist) {
        this.semaphore = semaphore;
        this.tourist = tourist;
    }
	
	private void takePhoto() {
		photo++;
	}

    static void stopRome(Runnable tourist) {

        try {
            evenQueue.put(tourist);
            notEvenQueue.put(tourist);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            evenQueue.take();
            notEvenQueue.take();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            if(!full) {

                double a = 1 + Math.random() * 4;
                semaphore.acquire();
                logger.info(tourist + " кушает пиццу или пасту!");

                logger.info("Время за которое кушает пиццу или пасту данный турист: " + a);
                full = true;

                logger.info("Сфотографировал!");
				takePhoto();

                Thread.sleep(3000);

                logger.info(tourist + " Вернулся обратно в автобус!");
                semaphore.release();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}