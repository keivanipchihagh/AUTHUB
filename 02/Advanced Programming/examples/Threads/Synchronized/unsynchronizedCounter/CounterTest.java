package unsynchronizedCounter;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(new MyThread(counter));
		Thread t2 = new Thread(new MyThread(counter));
		
		t1.start();
		t2.start();
		
		
		System.out.println(counter.getValue());

	}

}
