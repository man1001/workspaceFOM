package de.analyse;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;



public class Hauptmethode {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//deklaration
		int n;
		int sum;
		int max;
		int min;
		int dSchnitt;
		int x[];
		boolean run;
		byte opt;
		int k;
		boolean sortiert;
		
		//initialisierung
		run = true;
		x = new int[100];
		n = 0;
		k = 0;
		sum = 0;
		sortiert = true;

		
		Analyse tool = new Analyse();
		
		Scanner scan = new Scanner(System.in);
		
		// Daten aus alter Datei laden
		n = Analyse.readData(x);
			
		// Einstiegspunkt Menue ZahlentoolPlus
		while(run == true) {
			opt = -1;
			// Methode zum aufbauen des Menues
			tool.menueAufbauen();
			
			// Eingabe des Nutzers einlesen
			try {
				opt = scan.nextByte();
			} catch (Exception e) {
				// TODO: handle exception
				Analyse.printHeadline("Fehlerhafte Eingabe!");
				scan.next();
			}

	
			
			// Neue Zahl einlesen
			
			if(opt == 0) {
				n = tool.zahlEinlesen(x, n);
			}
			
			else if (opt == 1){
				tool.getArray(x, n);
			}
			
			// Summe bilden
			else if(opt == 2) {
				if(n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {
					// Methodenaufruf
					sum = tool.summeBerechnen(x, n);

				
				tool.printTrenner();
				System.out.printf("Summe: %d\n\n", sum);
				}
			}
			
			// Maximum suchen
			else if(opt == 3) {
				max = tool.getMax(x, n);
			}
			
			// Minimum suchen
			else if(opt == 4) {
				Analyse.getMin(x, n);
			}
			
			// Durchschnitt berechnen
			if(opt == 5) {
				tool.getDurchschnitt(x, n);
			}
			
			// Sortieren (aufsteigend)
			if(opt == 6) {
				tool.sortUp(x, n);
			}
			
			// Sortieren (absteigend)
			if(opt == 7) {
				tool.sortDown(x, n);
			}
			
			// Alle Zahlen entfernen, bzw Zaehler var n auf null setzten
			if(opt == 8) {
				n = 0;
				Analyse.printHeadline("Alle Zahlen entfernt!");
			}
			
			// Menue beenden -> Verabschiedung
			if(opt == 9) {
				System.out.println("Goodbye!");
				run = false;
			}
			
			// Array mit Random Zahlen befuellen
			if(opt == 10) {
				n = Analyse.addRandom(n, x);
			}
			
		}
				
	}

}
