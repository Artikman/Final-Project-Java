package com.company.sapriko;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinAdd extends RecursiveTask<Long> {

    private static final long THRESHOLD = 250_000_000;

    private final int start;
    private final int end;

    private ForkJoinAdd() {
        super();
        this.start = 0;
        this.end = 1_000_000_000;
    }

    private ForkJoinAdd(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            return add();
        }

        ForkJoinAdd firstTask = new ForkJoinAdd(start, start + (end - start) / 2);
        firstTask.fork();

        ForkJoinAdd secondTask = new ForkJoinAdd(start + (end - start)/ 2, end);

        Long secondTaskResult = secondTask.compute();
        Long firstTaskResult = firstTask.join();

        return firstTaskResult + secondTaskResult;
    }

    private long add() {
        long result = 0;
        for (int i = start; i < end;) {
            result+=++i;
        }
        return result;
    }

    static long run() {
        ForkJoinTask<Long> task = new ForkJoinAdd();
        return new ForkJoinPool().invoke(task);
    }
}