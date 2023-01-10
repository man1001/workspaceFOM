package de.bowsi;


public class Hauptmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablendeklaration und Initialisierung
		boolean run = true;
		int eingabe;
		Pkw herbie = new Pkw(15000, 5.0f, 60.0f, 6.4f);
		
		// Gespeicherte Daten laden
		herbie.readData();
		
		
		do {
			eingabe = herbie.runMenue();
			
			switch (eingabe) {
				
			case 1:
				if(herbie.fahren() == -1) {
					System.out.println("Zu wenig Benin!");
				}
				break;
				
			case 2:
				if(herbie.tanken() == -1) {
					System.out.println("Tank ist zu klein!");
				}
				break;
				
			case 3:
				System.out.printf("Kilometerstand: %d km\n", herbie.getKmStand());
				System.out.printf("Tankinhalt: %.2f l\n", herbie.getTankInhalt()); 
				System.out.printf("Reichweite: %.2f km\n", herbie.getReichweite());
				System.out.printf("Tankvolumen: %.2f l\n", herbie.getTankVolumen());
				break;
				
			case 4:
				run = false;
				System.out.println("Goodbye!");
				break;
					
			}
			if(run) {
				herbie.waitKeyPress();
			}

					
		} while(run);
		
		// Objekt Daten speichern
		herbie.safeData();
	}

}
