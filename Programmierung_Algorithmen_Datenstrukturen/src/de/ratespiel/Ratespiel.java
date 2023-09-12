package de.ratespiel;

import java.util.Random;

public class Ratespiel {

	private Random random = new Random();
	
	private int zufallsZahl = random.nextInt(11);
	private boolean gameRun = true;
	
	Spieler spieler01 = new Spieler();
	Spieler spieler02 = new Spieler();
	Spieler spieler03 = new Spieler();

	
	Spieler[] spielerArray = {spieler01, spieler02, spieler03};
	
	public void starteSpiel() {
		while(gameRun) {
			for (int i = 0; i < spielerArray.length; i++) {
				System.out.print("Spieler [" + (i + 1) +"]: ");
				spielerArray[i].raten();
			}
			System.out.println("Pruefe Gewinner:");
			for (int i = 0; i < spielerArray.length; i++) {
				if(spielerArray[i].pruefeGewinn(zufallsZahl)) {
					System.out.println("Spieler ["+ i + "] hat gewonnen.");
					gameRun = false;
					System.out.println("Die Zufallszahl war "+ zufallsZahl);
				}
			}
			if(gameRun) {
				System.out.println("Keine Gewinner!");
			}
		}
	}
}
