package com.politecnico.hilos.main.threads;

public class Thread extends java.lang.Thread {

    long id;
    long executionTime;
    long runningTimes;
    private String task;



    public Thread(long executionTime, long runningTimes) {
        this.id = this.getId();
        this.executionTime = executionTime;
        this.runningTimes = runningTimes;
    }

    @Override
    public void run() {
        System.out.println("El hilo: " + Thread.currentThread().getName() + ", inicia en 2s");
        try {
            java.lang.Thread.sleep((2000));
            System.out.println("Inicia Hilo");
            for (int i = 0; i < 100; i++) {
                java.lang.Thread.sleep((runningTimes));
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Se presento una excepcion en el hilo:" + id + Thread.currentThread().getName());
        }
    }
}
