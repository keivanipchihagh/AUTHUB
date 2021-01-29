package ThreadExample;

class AppleThread extends Thread {
    
	@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Apple " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.err.println("Apple is interrupted!");
            }
        }
    }
}
