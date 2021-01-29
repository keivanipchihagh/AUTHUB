package unsynchronizedCounter;

public class MyThread implements Runnable {
	private Counter counter;

	public MyThread(Counter c) {
		counter = c;
	}

	public void doCounting() {
		for (int i = 0; i < 1000000; i++) {
			if (i % 2 == 0)
				counter.increment();
			else
				counter.decrement();
		}
	}

	@Override
	public void run() {
		doCounting();
	}

}
