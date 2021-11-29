package com.politecnico.hilos.main.helpers;

import java.util.List;
import java.util.Random;

public class Process {

    final Random random = new Random();
    public final String SECONDS = "S";
    public final String MINUTES = "M";

    List<String> logger;

    long[] executionTimes = {};
    long[] runningTimes = {};

    public long[] getExecutionTimes() {
        return executionTimes;
    }

    public long[] getRunningTimes() {
        return runningTimes;
    }

    public List<String> getLogger() {
        return logger;
    }

    public void log(String message) {
        logger.add(message);
    }

}
