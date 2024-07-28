import JavaFeatures.Lock;

import java.util.concurrent.Semaphore;

public class LockDemo {


    public static void main(String[] args) throws InterruptedException {
        LockCounter lockCounter = new LockCounter() ;
        Thread t1 = new Thread(()->{
            System.out.println("Thread t1");
            try {
                int x = lockCounter.inc();
                System.out.println("INC : "+x);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println("Thread t2");
            try {
                int x= lockCounter.inc();
                System.out.println("INC : "+x);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(()->{
            System.out.println("Thread t3");
            try {
                int x= lockCounter.inc();
                System.out.println("INC : "+x);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();

        Semaphore semaphore = new Semaphore(3);
        semaphore.acquire();

    }




}
