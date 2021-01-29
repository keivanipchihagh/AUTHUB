package generics;

public class Animal {
	private String name;
	
	public Animal(String animalName) {
		name = animalName;
	}
	
	public void move() {
		System.out.println(name + " moved!");
	}
	
	@Override
	public String toString() {
		return name;
	}

}
