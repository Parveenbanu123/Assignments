package com.mphasis;


public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //main 
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());//Daemon in java is GC
        System.out.println(thread.isInterrupted());
        
        Thread t1=new Thread("thread1");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        //t1.setPriority(10);
        System.out.println(t1.getPriority());
        t1.start();
        t1.run();
    }
}
