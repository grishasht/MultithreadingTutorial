package concurency.prodcons;

import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {

    private final ReentrantLock mutex;

    private final Resource resource;
    private int emptyCount;

    public Consumer(ReentrantLock mutex, Resource resource) {
        this.mutex = mutex;
        this.resource = resource;
    }

    @Override
    public void run() {
        System.out.println("Consumer start");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }

        do {

            if (resource.isFull()) {
                mutex.lock();
            }

            try {
                resource.pop();
            } finally {
                if (resource.isEmpty()) {
                    emptyCount++;
                    mutex.unlock();
                }
            }

        } while (emptyCount != 10);

        System.out.println("Consumer end");
    }

}
