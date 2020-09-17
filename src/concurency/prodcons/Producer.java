package concurency.prodcons;

import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {

    private final ReentrantLock mutex;

    private final Resource resource;
    private int count;

    public Producer(ReentrantLock mutex, Resource resource) {
        this.mutex = mutex;
        this.resource = resource;
    }

    @Override
    public void run() {

        System.out.println("Producer start");

        do {
            if (resource.isEmpty()) {
                mutex.lock();
            }

            try {
                resource.put(new Element(count++));
            } finally {
                if (resource.isFull()) {
                    mutex.unlock();
                }
            }

        } while (count != 100);

        System.out.println("Producer end");
    }
}
