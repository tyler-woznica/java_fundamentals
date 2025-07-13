package labs_examples.multi_threading.labs;

// Multithreading Exercise 5:
// Demonstrate the use of a wait() and notify()

class Exercise_05 {
    public static void main(String[] args) {

        SharedObj shared = new SharedObj();
        Thread waiter = new Thread(() -> shared.waitForSignal());
        Thread notifier = new Thread(() -> shared.sendSignal());

        waiter.start();
        notifier.start();

    }

    static class SharedObj {

        public synchronized void waitForSignal() {
            System.out.println("Waiting for signal...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Recieved signal and continuing...");
        }

        public synchronized void sendSignal() {
            System.out.println("Sending signal...");
            notify();
        }
    }
}