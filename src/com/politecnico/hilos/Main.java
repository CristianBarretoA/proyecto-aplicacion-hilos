package com.politecnico.hilos;

import com.politecnico.hilos.main.helpers.Init;
import com.politecnico.hilos.main.helpers.Process;
import com.politecnico.hilos.main.helpers.Runner;
import com.politecnico.hilos.main.threads.Thread;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("A continuación se ejecutaran 3 tareas ciclicas en diferentes hilos, duración de total 6 min.");
        //Parametrize the execution time, minutes
        int[] executionTimes = {2, 3, 1};
        //Parametrize the running time for each loop of the task, seconds
        int[] runningTimes = {5, 12, 2};

        //Inits process
        /*Thread hilo = new Thread(2,1000);
        hilo.start();*/

        //TODO: Add the task execution process
        Init process = new Init(executionTimes, runningTimes);
        Runner runner = new Runner(process);
        runner.runThreads();

    }


}
