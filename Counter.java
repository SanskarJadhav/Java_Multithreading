public class Counter {
    // setting private variable
    private int count;
    // using synchronized keyword
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}