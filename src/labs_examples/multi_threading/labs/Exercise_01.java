package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class Exercise_01 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running anonymous thread.");
            }
        });
        thread2.start();

    }

    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Running my thread!");
        }
    }

}