package com.company.sapriko;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class Runner
{
    public static void main( String[] args ) throws InterruptedException {

        final Logger logger = Logger.getLogger(Runner.class.getName());

            Phaser phaser = new Phaser(1);

            Exchanger<Integer> exchanger = new Exchanger<>();

            PhotoCloud photoCloud = new PhotoCloud(exchanger);

            logger.info("Started bus");

            ExecutorService service = Executors.newFixedThreadPool(90);

            service.execute(photoCloud);

            phaser.arriveAndAwaitAdvance();

            phaser.arriveAndAwaitAdvance();

            Semaphore semaphore = new Semaphore(1);
            logger.info("Привествуем вас в Cтаром городе!");
            for (int x = 0; x < 40; x++) {
                Thread.sleep(500);

                new StopPraga(semaphore, "").start();
            }

            phaser.arriveAndAwaitAdvance();

            Semaphore semaphore1 = new Semaphore(5);
            logger.info("Приветствуем вас в Париже - Лувр!");
            for (int a = 0; a < 40; a++) {
                Thread.sleep(1000);
                new StopParis(semaphore1, "").start();
            }

            phaser.arriveAndAwaitAdvance();

            Semaphore semaphore2 = new Semaphore(5);
            logger.info("Приветствуем вас в Вечном Риме!");
            for (int b = 0; b < 40; b++) {
                Thread.sleep(1500);
                new StopRome(semaphore2, "").start();
            }

            Semaphore semaphore3 = new Semaphore(5);
            logger.info("Приветствуем вас в Испании!");
            for (int b = 0; b < 40; b++) {
                Thread.sleep(2000);
                new StopSpanish(semaphore3, "").start();
            }

            phaser.arriveAndAwaitAdvance();

            photoCloud.outputSum();

            phaser.arriveAndDeregister();

            photoCloud.stop();

            service.shutdownNow();
    }
}