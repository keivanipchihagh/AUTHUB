package ThreadExample;

public class Fruit {
	public static void main(String[] args) {

		OrangeThread orange = new OrangeThread("Orange 1");
		orange.start();

//		OrangeThread orange2 = new OrangeThread("Orange 2");
//		orange2.start();
		
		AppleThread apple = new AppleThread();
		apple.start();

		long sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			if (i % 200000000 == 0) {
				System.out.println("Main thread: busy doing my calculations.");
				apple.interrupt();
			}

			sum += Math.sin(Math.sqrt(5852.5 + i));
		}
		
		
		
//		try {
//			System.out.println("Main thread: waiting for the orange to be eaten!");
//			orange.join();
//			System.out.println("Main thread: orange is completely eaten.");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Main thread: intrrupting orange thread.");
		orange.interrupt();
		
		System.out.println("Main thread: done. Sum is: " + sum);

	}
}
