package de.bowsi.abstrakteKlasse;

abstract class Bike {
	public Bike() {
		System.out.println("Erstellung eines Bike-Objekts");
	}
	
	abstract void run();
	void changeGear() {
		System.out.println("Gang gewechselt!");
	}
}
