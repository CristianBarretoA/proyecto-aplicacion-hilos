package com.politecnico.hilos.main.threads;

public class Thread extends java.lang.Thread {

    long id;
    long executionTime;
    long runningTimes;

    public Thread(long executionTime, long runningTimes) {
        this.id = this.getId();
        this.executionTime = executionTime;
        this.runningTimes = runningTimes;
    }

    @Override
    public void run() {
        System.out.println("Se esta ejecutando el hilo N." + id + Thread.currentThread().getName());

        try {
            java.lang.Thread.sleep((this.executionTime));
        } catch (InterruptedException e) {
            System.out.println("Se presento una excepcion en el hilo:" + id + Thread.currentThread().getName());
        }
    }

    public String log(){
        return "";
    }
}
