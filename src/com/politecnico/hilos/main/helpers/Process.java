package com.politecnico.hilos.main.helpers;

import java.util.List;
import java.util.Random;

public class Process {

    final Random random = new Random();
    public final String SECONDS = "S";
    public final String MINUTES = "M";

    long[] executionTimes = {1,1,1};
    long[] runningTimes = {1,1,1};

    public long[] getExecutionTimes() {
        return executionTimes;
    }

    public long[] getRunningTimes() {
        return runningTimes;
    }

}
