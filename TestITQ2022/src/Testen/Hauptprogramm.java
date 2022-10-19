package Testen;

import java.util.Scanner;

public class Hauptprogramm {

	public static void main(String[] args) {
		
		/* Variablendeklaration */
		short breite = 0;
		short hoehe = 0;
		short flaeche = 0;
		
		boolean tBreite = false;
		boolean tHoehe = false;
		
		
		/* Insanzbildung */
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Flächenberechnung");
		System.out.println("=================");
		System.out.println();

		
		/* Eingabe */
		
		while(tBreite == false) {
			try {
				System.out.println("Breite: ");
				breite = scan.nextShort();
				tBreite = true;
			} catch (Exception e) {
				System.out.println("[!]Fehler: Bitte nur ganze Zahlen eingeben");
				scan.next();
			}
		}

		while(tHoehe == false) {

			try {
				System.out.println("Höhe: ");
				hoehe = scan.nextShort();
				tHoehe = true;
			} catch (Exception e) {
				System.out.println("[!]Fehler: Bitte nur ganze Zahlen eingeben");
				scan.next();
			
			}
		}
		


		
		/* Verarbeitung */
		
		flaeche = (short)(breite*hoehe);	

		
		/* Ausgabe */
		
		System.out.println("Die Fläche ist: " + flaeche);
		
		scan.close();
	}
	
}
