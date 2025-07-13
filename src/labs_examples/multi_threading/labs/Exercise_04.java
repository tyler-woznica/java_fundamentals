package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public static void main(String[] args) {

        Syncro syncThread = new Syncro();

        Thread thread1 = new Thread(() -> syncThread.syncMethod());
        Thread thread2 = new Thread(() -> syncThread.syncBlock());

        thread1.start();
        thread2.start();

    }

    static class Syncro {
        int count = 0;

        public synchronized void syncMethod() {
            count++;
            System.out.println("Sync Method count: " + count);
        }

        public void syncBlock() {
            synchronized (this) {
                count++;
                System.out.println("Sync Block count: " + count);
            }
        }

    }

}