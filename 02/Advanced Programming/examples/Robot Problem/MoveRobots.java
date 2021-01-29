package observerExercise;

public class MoveRobots {
	
	public static void main(String[] args) {
		Robot robot1 = new Robot("Robot1");
		Robot robot2 = new Robot("Robot2");
		
		System.out.println(robot1);
		System.out.println(robot2);
		
		robot1.add(robot2);
		System.out.println(robot1);
		robot2.add(robot1);
		System.out.println(robot2);
		
		robot1.setState("Up");
		System.out.println(robot1);
		System.out.println(robot2);
		
		robot1.setState("Down");
		System.out.println(robot1);
		System.out.println(robot2);
		
		robot2.setState("Up");
		System.out.println(robot2);
		System.out.println(robot1);
	}

}
