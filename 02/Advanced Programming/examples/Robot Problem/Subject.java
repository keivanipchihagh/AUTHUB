package observerExercise;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> ObList;
	private String subjectName;
	
	public Subject() {
		ObList = new ArrayList<>();
	}
	
	public Subject(String newName) {
		this();
		subjectName = newName;
		
	}
	
	public abstract String getState();
	
	public String getName() {
		return subjectName;
	}
	
	public void attach(Observer ob) {
		ObList.add(ob);
	}
	
	public void dettach(Observer ob) {
		ObList.remove(ob);
	}
	
	public void notifyObservers() {
		for (Observer ob : ObList) {
			ob.update();
		}
	}
}
