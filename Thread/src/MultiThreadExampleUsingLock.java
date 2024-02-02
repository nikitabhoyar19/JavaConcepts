class MyThread extends Thread {
    private static final Object lock = new Object(); // Shared lock object
    private static int counter = 1;

    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 5; i++) {
                // Ensure threads print in order
                while (counter != getId()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getId() + " - Count " + i);
                counter = (counter % 4) + 1;

                lock.notifyAll(); // Notify waiting threads
            }
        }
    }
}

public class MultiThreadExampleUsingLock {
    public static void main(String args[]) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();

        thread1.start();
        thread2.start();

    }
}