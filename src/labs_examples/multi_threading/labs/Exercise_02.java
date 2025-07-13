package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();

        System.out.println("MyThread Priority: " + thread1.getPriority());

    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Running MyThread that extends Thread.");
        }
    }
}