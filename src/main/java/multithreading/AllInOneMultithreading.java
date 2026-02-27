package multithreading;
public class AllInOneMultithreading {

    /* ===============================
       1️⃣ Thread using Thread class
       =============================== */
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread created using Thread class");
        }
    }

    /* ===============================
       2️⃣ Thread using Runnable
       =============================== */
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread created using Runnable interface");
        }
    }

    /* ===============================
       3️⃣ Synchronization Example
       =============================== */
    static class Counter {
        int count = 0;

        synchronized void increment() {
            count++;
        }
    }

    static class CounterThread extends Thread {
        Counter counter;

        CounterThread(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    /* ===============================
       4️⃣ Deadlock Example
       =============================== */
    static class Deadlock {

        static final Object lock1 = new Object();
        static final Object lock2 = new Object();

        static class Thread1 extends Thread {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread1 locked lock1");
                    try { Thread.sleep(100); } catch (Exception e) {}

                    synchronized (lock2) {
                        System.out.println("Thread1 locked lock2");
                    }
                }
            }
        }

        static class Thread2 extends Thread {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread2 locked lock2");
                    try { Thread.sleep(100); } catch (Exception e) {}

                    synchronized (lock1) {
                        System.out.println("Thread2 locked lock1");
                    }
                }
            }
        }
    }

    /* ===============================
       MAIN METHOD
       =============================== */
    public static void main(String[] args) throws InterruptedException {

        System.out.println("---- Thread using Thread class ----");
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("---- Thread using Runnable ----");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        System.out.println("---- Synchronization Example ----");
        Counter counter = new Counter();
        CounterThread ct1 = new CounterThread(counter);
        CounterThread ct2 = new CounterThread(counter);

        ct1.start();
        ct2.start();
        ct1.join();
        ct2.join();

        System.out.println("Final Counter Value: " + counter.count);

        System.out.println("---- Deadlock Example ----");
        Deadlock.Thread1 d1 = new Deadlock.Thread1();
        Deadlock.Thread2 d2 = new Deadlock.Thread2();

        d1.start();
        d2.start();
    }
}
