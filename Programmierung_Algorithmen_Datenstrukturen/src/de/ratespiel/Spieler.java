package de.ratespiel;

import java.util.Random;

public class Spieler {
	private int zahl; //hier kommt der Tipp rein
	
	boolean gewonnen = false;
	Random random = new Random();
	
	public void raten() {
		zahl = random.nextInt(11);
		System.out.println("Ich tippe auf die Zahl: " + zahl);
	}
	
	public boolean pruefeGewinn(int zufallsZahl) {
		if(zahl == zufallsZahl) {
			gewonnen = true;
		}
		return gewonnen;
	}
	
}
