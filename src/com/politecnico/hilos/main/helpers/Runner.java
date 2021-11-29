package com.politecnico.hilos.main.helpers;

import com.politecnico.hilos.main.threads.Thread;

import java.util.Arrays;
import java.util.List;

public class Runner extends Process {

    private Init init;
    private List<Thread> threads;

    public Runner(Init init) {
        try {
            /*threads.add(crateThread(init.getExecutionTimes()[0], init.getRunningTimes()[0]));*/
            for (int i = 0; i < 3; i++) {
                System.out.println(init.getExecutionTimes()[i] + " " + init.getRunningTimes()[i]);
                /*threads.add(crateThread(init.getExecutionTimes()[i], init.getRunningTimes()[i]));*/
            }
        } catch (Exception exception) {
            System.out.printf(exception.getMessage());
        }
    }

    public void runThreads() {
        threads.forEach(thread -> {
            thread.run();
        });
    }

    public void executeTask() {

    }

    public Thread crateThread(long executionTime, long runningTime) {
        return new Thread(executionTime, runningTime);
    }

}
