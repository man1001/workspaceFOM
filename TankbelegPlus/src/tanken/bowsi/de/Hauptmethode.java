package tanken.bowsi.de;

import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Hauptmethode {
	

	public static void main(String[] args) {
		// Variablen deklaration
		
		boolean run;
		boolean eingabeKorrekt;
		String tmpDatum;
		float tmpLiter;
		int tmpKmStand;
		float tmpKmAnfangsStand;
		float tmpPreisProLiter;
		
		byte opt = 0;
		
		// Variablen initialisierung
		run = true;
		
		// Scanner Objekt initialisieren
		Scanner scan = new Scanner(System.in);
		
		// File Objekt initialisieren
		File f = new File(Beleg.path);
		
		// Araylist initialisieren
		ArrayList<Beleg> aList = new ArrayList<Beleg>();
		
		// Pruefen ob eine Datei mit gespeicherten Werten vorliegt falls ja
		// werden die Daten ¸ber die Methode .loadDate() in die Arrayliste geladen
		
		if(f.exists() && !f.isDirectory()) {
			aList = Beleg.loadData();
		}
		
		// Menueaufbau
		while(run == true) {
			System.out.println(" Hauptmen¸ Tankbelege");
			System.out.println(" ====================");
			
			System.out.println(" 0 - ENDE");
			System.out.println(" 1 - Neuer Tankbeleg");
			System.out.println(" 2 - Belegliste");
			System.out.println(" 3 - Statistik");
			System.out.println(" 4 - Neu beginnen");
		
			System.out.println("\n Ihre Wahl: ");
			
			opt = scan.nextByte();

			// Option -> Option zum verlassen der While-Schleife
			if(opt == 0) {
				run = false;
				System.out.println(" Goodbye!");
			}
			
			// Option -> Eingabe neuer Tankbeleg
			if(opt == 1) {
				System.out.println(" Eingabe neuer Tankbeleg");
				System.out.println(" =======================");
				
				
				// Eingabe der Daten fuer den Beleg
				System.out.println("\n Bitte das Datum[dd.mm.yyyy] eingeben: ");
				tmpDatum = scan.next();
				
				System.out.println("\n Bitte die Menge der Liter[l] eingeben:");
				tmpLiter = scan.nextFloat();
				
				System.out.println("\n Bitte den Kilometerstand[km] eingeben: ");
				tmpKmStand = scan.nextInt();
				
				System.out.println("\n Bitte den Preis pro Liter eingeben: ");
				tmpPreisProLiter = scan.nextFloat();
				
				
				// Objekt der Klasse Beleg initialisieren
				Beleg beleg = new Beleg(tmpDatum, tmpLiter, tmpKmStand, tmpPreisProLiter);
				aList.add(beleg);
				
			}
			
			// Option -> Belegliste anzeigen lassen
			if(opt == 2) {
				System.out.println(" Ausgabe Belegliste");
				System.out.println(" ==================\n");
				System.out.printf(" ID     Datum           Liter[l]  Kilometerstand[km] Preis[Ä/l]\n");
				System.out.println(" --------------------------------------------------------------");
				for(int i = 0; i < aList.size(); i++) {
					
					System.out.printf(" %3d | %s     | %-6.2f  | %10d        | %4.2f\n", aList.get(i).getID(), aList.get(i).getDatum(), aList.get(i).getLiter(), aList.get(i).getKmStand(), aList.get(i).getPreisProLiter());
				}
				
				System.out.println(" --------------------------------------------------------------\n");
			}
			
			// Option -> Statistik anzeigen lassen
			if(opt == 3) {
				
			}
			
			// Option -> neu beginnen
			if(opt == 4) {
				// entfernt alle Objekte aus der Arraylist
				aList.clear();
			}
			
			// Manuelles Speichern -> Debugging
			if(opt == 5) {	
				Beleg.saveDate(aList);
			}
			
			// Beleg mit Dummy Werten erstellen -> Debugging
			if(opt == 6) {
				Beleg beleg = new Beleg("01.01.2010", 40.4f, 4004004, 1.99f);
				aList.add(beleg);
			}
			
			// Manuelles Laden der gespeicherten Daten -> Debugging
			if(opt == 7) {
				aList = Beleg.loadData();
			}
			
		}
		
		// Daten speichern
		Beleg.saveDate(aList);
		
		// Scanner schlieﬂen
		scan.close();
	}

}
