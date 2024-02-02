// Example using Thread class
class MyThread1 extends Thread {
    public void run() {
        String example = "God_is_Everything";
        for (int i = 5; i <= 10; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count " + example.charAt(i));
        }
    }
}

// Example using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count " + i);
        }
    }
}

public class MultiThreadExample {
    public static void main(String args[]) {
        // Creating threads using Thread class
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        MyThread1 thread5 = new MyThread1();


        // Creating threads using Runnable interface
        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());

        // Starting threads
        thread1.start();
        thread2.start();
        thread5.start();
        thread3.start();
        thread4.start();
    }
}