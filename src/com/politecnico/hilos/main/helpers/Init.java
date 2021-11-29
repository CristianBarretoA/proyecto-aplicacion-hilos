package com.politecnico.hilos.main.helpers;

import com.politecnico.hilos.main.threads.Thread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Init extends Process {

    public Init(int[] executionTime, int[] runningTime) {
        this.executionTimes = new long[]{
                generateTime(executionTime[0], MINUTES),
                generateTime(executionTime[1], MINUTES),
                generateTime(executionTime[2], MINUTES)
        };
        runningTimes = new long[]{
                generateTime(runningTime[0], SECONDS),
                generateTime(runningTime[1], SECONDS),
                generateTime(runningTime[2], SECONDS)
        };
    }

    public void run() {
        Thread hilo = new Thread(this.executionTimes[0], this.runningTimes[0]);
        Thread hilo2 = new Thread(this.executionTimes[1], this.runningTimes[1]);
        Thread hilo3 = new Thread(this.executionTimes[2], this.runningTimes[2]);
    }

    private long generateTime(int time, String type) {
        if (MINUTES.equals(type)) {
            return TimeUnit.MINUTES.toMillis(this.random.nextInt(time));
        }
        return TimeUnit.SECONDS.toMillis(this.random.nextInt(time));
    }
}
