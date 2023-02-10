package tanken.bowsi.de;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Hauptmethode {
	

	public static void main(String[] args) {
		/* Variablen deklaration */
		
		boolean run;
		String tmpDatum;
		float tmpLiter;
		int tmpKmStand;
		float tmpPreisProLiter;
		
		byte opt = 0;
		
		/* Variablen initialisierung */
		run = true;
		
		/* Scanner Objekt initialisieren */
		Scanner scan = new Scanner(System.in);
		
		/* File Objekt initialisieren */
		File f = new File(Beleg.path);
		
		/* Araylist initialisieren */
		ArrayList<Beleg> aList = new ArrayList<Beleg>();
		
		/* Pruefen ob eine Datei mit gespeicherten Werten vorliegt falls ja
		werden die Daten ¸ber die Methode .loadDate() aus der Klasse Beleg in die Arrayliste geladen */
		
		if(f.exists() && !f.isDirectory()) {
			aList = Beleg.loadData();
		}
		
		/* Menueaufbau */
		while(run == true) {

			System.out.println("\n Hauptmen¸ Tankbelege");
			System.out.println(" ====================");
			
			System.out.println(" 0 - ENDE");
			System.out.println(" 1 - Neuer Tankbeleg");
			System.out.println(" 2 - Belegliste");
			System.out.println(" 3 - Statistik");
			System.out.println(" 4 - Neu beginnen");
		
			System.out.print("\n Ihre Wahl: ");
			
			opt = scan.nextByte();

			/* Option -> Option zum verlassen der While-Schleife */
			if(opt == 0) {
				run = false;
				System.out.println(" Goodbye!");
			}
			
			/* Option -> Eingabe neuer Tankbeleg */
			if(opt == 1) {
				System.out.println("\n Eingabe neuer Tankbeleg");
				System.out.println(" =======================");
				
				
				/* Eingabe der Daten fuer den Beleg */
				System.out.print("\n Bitte das Datum[dd.mm.yyyy] eingeben: ");
				tmpDatum = scan.next();
				
				System.out.print("\n Bitte die Menge der Liter[l] eingeben:");
				tmpLiter = scan.nextFloat();
				
				System.out.print("\n Bitte den Kilometerstand[km] eingeben: ");
				tmpKmStand = scan.nextInt();
				
				System.out.print("\n Bitte den Preis pro Liter eingeben: ");
				tmpPreisProLiter = scan.nextFloat();
				
				
				/* Objekt der Klasse Beleg initialisieren */
				Beleg beleg = new Beleg(tmpDatum, tmpLiter, tmpKmStand, tmpPreisProLiter);
				aList.add(beleg);
				
			}
			
			/* Option -> Belegliste anzeigen lassen */
			if(opt == 2) {
				System.out.println("\n Ausgabe Belegliste");
				System.out.println(" ==================");
				System.out.printf("  ID     Datum           Liter[l]  Kilometerstand[km] Preis[Ä/l]\n");
				System.out.println(" +-----+----------------+---------+-------------------+---------+");
				for(int i = 0; i < aList.size(); i++) {
					
					System.out.printf(" | %3d | %s     | %6.2f  | %-10d        | %6.2f  |\n", aList.get(i).getID(), aList.get(i).getDatum(), aList.get(i).getLiter(), aList.get(i).getKmStand(), aList.get(i).getPreisProLiter());
				}
				
				System.out.println(" +-----+----------------+---------+-------------------+---------+\n");
			}
			
			/* Option -> Statistik anzeigen lassen */
			if(opt == 3) {
					
					// Gesamtzahl getankte Liter
					double getankteLiter = 0;
					
					// Gesamtzahl der Kilometer
					int kmGesamt = 0;
					
					// Ausgaben fuer Kraftstoff
					double aGesamt = 0;
					
					for(int i = 0; i < aList.size(); i++) {
						getankteLiter = getankteLiter + aList.get(i).getLiter();
						
						aGesamt = aGesamt + (aList.get(i).getLiter()* aList.get(i).getPreisProLiter());
						
					}
					/*
					Annahme: Mit dem Programm werden die Daten f¸r einen bestimmten Wagen dokumentiert und diese wurden nacheinander
					d.h. in der richtigen zeitlichen Reihenfolge in das Programm eingegeben
					Weitere Annahme: Das Programm wurde von Anfang an lueckenlos fuer das Dokumentieren der Belege verwendet 
					Daraus folgt das der Betrag auf dem letzten in die ArrayListe eingetragenen Beleg den gefahrenen Kilometern entspricht
					*/
					kmGesamt = aList.get(aList.size() - 1).getKmStand();
					
					System.out.println("\n Auswertung Statistik");
					System.out.println(" ====================");
					System.out.printf(" Durchschnitt: %.2f [Liter/100km]\n", getankteLiter/kmGesamt * 100);
					System.out.printf(" Ausgaben f¸r Kraftstoff: %.2f [Euro]\n", aGesamt);
					System.out.printf(" Gefahrene Kilometer: %d [km]\n", kmGesamt);
			}
			
			/* Option -> neu beginnen */
			if(opt == 4) {
				// entfernt alle Objekte aus der Arraylist
				aList.clear();
			}
			
			/* Manuelles Speichern -> Debugging */
			if(opt == 5) {	
				Beleg.saveDate(aList);
			}
			
			/* Beleg mit Dummy Werten erstellen -> Debugging */
			if(opt == 6) {
				Beleg beleg = new Beleg("01.01.2010", 40.4f, 4004004, 1.99f);
				aList.add(beleg);
			}
			
			/* Manuelles Laden der gespeicherten Daten -> Debugging */
			if(opt == 7) {
				aList = Beleg.loadData();
			}
			
			
		}
		
		/* Daten nach beenden der While-Schleife mit Option 0 speichern */
		Beleg.saveDate(aList);
		
		/* Scanner schlieﬂen */
		scan.close();
	}

}
