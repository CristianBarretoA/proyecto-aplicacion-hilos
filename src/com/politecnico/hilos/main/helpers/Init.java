package com.politecnico.hilos.main.helpers;

import com.politecnico.hilos.main.threads.Thread;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Init extends Process {

    /**
     *
     * @param executionTime
     * @param runningTime
     */
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

    /**
     *  Get the type MINUTES or SECONDS and returns
     *
     * @param time
     * @param type
     * @return
     */
    private long generateTime(int time, String type) {
        if (MINUTES.equals(type)) {
            return TimeUnit.MINUTES.toMillis(this.random.nextInt(time));
        }
        return TimeUnit.SECONDS.toMillis(this.random.nextInt(time));
    }
}
