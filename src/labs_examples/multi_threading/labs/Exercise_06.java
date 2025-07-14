package labs_examples.multi_threading.labs;

 // Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 // print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.

class Exercise_06 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> counter.printNumbers(1));
        Thread thread2 = new Thread(() -> counter.printNumbers(0));

        thread1.start();
        thread2.start();

    }

    static class Counter {

        private int num = 1;
        private final int MAX = 100;

        public synchronized void printNumbers(int remainder) {

            while (num <= MAX) {

                if (num % 2 == remainder) {

                    System.out.println("Thread " + Thread.currentThread().getName() + ": " + num);
                    num++;

                    notify();

                } else {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                }

            }
            notify();
        }

    }

}