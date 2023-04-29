// Sanskar Jadhav AIML B1 PRN 21070126076
public class CountMain {
    public static void main(String[] args) throws InterruptedException {
        // instances for counter and two threads
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        // start both threads
        thread1.start();
        thread2.start();
        // check if one is alive
        System.out.println(thread1.isAlive());
        // wait till both end
        thread1.join();
        thread2.join();
        // see the final count
        System.out.println(counter.getCount());
        // set name for second thread
        thread2.setName("Second Thread");
        // see names for both threads
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        // check if thread was interrupted
        System.out.println(thread2.isInterrupted());
    }
}
