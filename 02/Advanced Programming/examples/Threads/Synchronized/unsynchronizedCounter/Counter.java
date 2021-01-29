package unsynchronizedCounter;

public class Counter {
    private int c = 0;

    public void increment() {
        int old = c;
        c = old + 1;  // c++;
    }    

    public void decrement() {
        int old = c;
        c = old - 1;  // c--;
    }    

    public int getValue() {
        return c;
    }
}
