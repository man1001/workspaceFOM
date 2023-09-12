package de.bowsi;

public class Hauptklasse {

	public static void main(String[] args) {
		
		Dog dog01 = new Dog(2, "Cocker Spaniel", "Waldo");
		Dog dog02 = new Dog();
		
		dog01.bark();
		dog01.wagTail();
		dog01.eat();

	}

}
