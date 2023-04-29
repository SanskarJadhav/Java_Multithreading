public class MyThread extends Thread {
    // creating private object for Counter class
    private Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    // override run method
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}