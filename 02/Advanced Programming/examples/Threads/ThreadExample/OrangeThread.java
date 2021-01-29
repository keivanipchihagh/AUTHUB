package ThreadExample;

class OrangeThread extends Thread {
	String threadName;
	
	public OrangeThread(String name) {
		threadName = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 10) {
			System.out.println(threadName + ": Eating orange is " + i + "% done!");
			for (int j = 0; j < 100000000; j++ ) {
				Math.asin(152.1);
			}
			if(Thread.interrupted())
				System.out.println("Got interrupted!");
			
			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.err.println(threadName + ": Orange thread was intrrupted. " + i + "% of the work was done.");
//				e.printStackTrace();
//			}
		}
		
		System.out.println(threadName + ": Done eating the orange.");
	}

}
