package de.bowsi;

public class Hauptmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablendeklaration und Initialisierung
		boolean run = true;
		int eingabe;
		Pkw herbie = new Pkw(15000, 5.0f, 60.0f, 6.4f);
		
		do {
			eingabe = herbie.runMenue();
			
			switch (eingabe) {
			case 1:
				herbie.fahren();
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
				break;
				
			case 4:
				run = false;
				System.out.println("Goodbye!");
				
				
			default:
				System.out.println("Ungueltige Eingabe!");
				break;
			}
			herbie.waitKeyPress();
					
		} while(run == true);
		
		
	}

}
