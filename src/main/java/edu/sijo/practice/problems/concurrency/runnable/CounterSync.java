package edu.sijo.practice.problems.concurrency.runnable;

public class CounterSync implements Runnable {

    private int count = 0;

    private void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    private void decrement() {
        count--;
    }

    private int getCount() {
        return count;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments " + this.getCount());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrements " + this.getCount());
            System.out.println();
        }

    }
}
