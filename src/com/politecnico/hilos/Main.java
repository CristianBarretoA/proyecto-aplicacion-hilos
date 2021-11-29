package com.politecnico.hilos;

import com.politecnico.hilos.main.helpers.Init;
import com.politecnico.hilos.main.helpers.Process;
import com.politecnico.hilos.main.threads.Thread;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("A continuación se ejecutaran 3 tareas ciclicas en diferentes hilos, duración de total 6 min.");
        //Parametrize the execution time, minutes
        int[] executionTimes = {2, 3, 1};
        //Parametrize the running time for each loop of the task, seconds
        int[] runningTimes = {5, 12, 2};

        //Thread hilo = new Thread(1);
        Process process = new Init(executionTimes, runningTimes);

        Arrays.stream(process.getExecutionTimes()).forEach(executionTime -> {
            Thread hilo = new Thread(executionTime, process.getRunningTimes()[new Random().nextInt(2)]);
        });

    }


}
