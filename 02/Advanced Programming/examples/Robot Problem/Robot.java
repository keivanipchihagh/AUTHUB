package observerExercise;

public class Robot extends Subject implements Observer {

	// this is for the subject part
	private String handPosition;
	
	// this is for the observer part
	private Subject observing;
	
	public Robot(String name) {
		super(name);
		handPosition = "Down";
	}
	
	public String getState() {
		return handPosition;
	}
	
	public void setState(String newPosition) {
		handPosition = newPosition;
		notifyObservers();
	}

	// related to the observer part of the robot
	@Override
	public void update() {
		String newHandPosition = observing.getState();
		
		// updating/mimicking other robot action 
		handPosition = newHandPosition;
	}

	@Override
	public void add(Subject sbj) {
		observing = sbj;
		sbj.attach(this);
	}
	
	@Override
	public String toString() {
		return "This is " + getName() + ". Hand is " + handPosition + ". Observing " + ((observing != null) ?  observing.getName() : "No body");
	}
	
}
