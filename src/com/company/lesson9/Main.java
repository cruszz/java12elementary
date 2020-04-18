package com.company.lesson9;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.run();
        System.out.println("Main 1");
        System.out.println("Main 2");

    }
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("MyRunnable 1");
            System.out.println("MyRunnable 2");
        }
    }
}
