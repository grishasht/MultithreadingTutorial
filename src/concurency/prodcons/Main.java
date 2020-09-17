package concurency.prodcons;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock mutex = new ReentrantLock();

        Resource resource = new Resource();

        Thread producerThread = new Thread(new Producer(mutex, resource));
        Thread consumerThread = new Thread(new Consumer(mutex, resource));

        producerThread.start();
        consumerThread.start();
    }
}
