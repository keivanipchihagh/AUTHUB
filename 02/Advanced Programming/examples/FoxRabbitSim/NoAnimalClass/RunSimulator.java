
public class RunSimulator {

	public static void main(String[] args) throws InterruptedException {
		
		Simulator sim = new Simulator(120, 180);
		sim.simulateOneStep();
		Thread.sleep(5000);
		
		for (int i = 0; i < 200; i++) {
			sim.simulateOneStep();
			Thread.sleep(300);
		}
		
//		sim.runLongSimulation();
		
		

	}

}
