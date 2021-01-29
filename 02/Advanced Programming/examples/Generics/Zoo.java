package generics;

import java.util.ArrayList;

public class Zoo<A extends Animal> {

	private ArrayList<A> animals = new ArrayList<A>();

	public void add(A animal) {
		animals.add(animal);
	}

	public void display() {
		System.out.println(animals.toString());
	}

}
