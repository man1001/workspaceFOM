package de.analyse;

import java.util.Random;
import java.util.Scanner;



public class Hauptmethode {
	

	public static void main(String[] args) {
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
		
		Analyse analyse = new Analyse();
		
		Scanner scan = new Scanner(System.in);
			
		// Einstiegspunkt Menue ZahlenanalysePlus
		while(run == true) {
			
			// Methode zum aufbauen des Menues
			Analyse.menueAufbauen();
			
			// Eingabe des Nutzers einlesen
			opt = scan.nextByte();
	
			
			// Neue Zahl einlesen
			
			if(opt == 0) {
				n = analyse.zahlEinlesen(x, n);
			}
			
			else if (opt == 1){
				Analyse.getArray(x, n);
			}
			
			// Summe bilden
			else if(opt == 2) {
				if(n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {
					// Methodenaufruf
					sum = Analyse.summeBerechnen(x, n);

				
				Analyse.printTrenner();
				System.out.printf("Summe: %d\n\n", sum);
				}
			}
			
			// Maximum suchen
			else if(opt == 3) {
				if(n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {
					max = 0;
					for(int i = 0; i < n; i++) {	
						if(x[i]>= max) {
							max = x[i];
						}
					}
				System.out.println("Maximum: "+ max);
				}

			}
			
			// Minimum suchen
			else if(opt == 3) {
				if(n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {
					min = 0;
					for(int i = 0; i < n; i++) {	
						if(x[i] <= min) {
							min = x[i];
						}
					}
				System.out.println("Maximum: "+ min);
				}

			}
			
			// Durchschnitt berechnen
			if(opt == 5) {
				
			}
			
			// Sortieren (aufsteigend)
			if(opt == 6) {
				if (n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {
					int tausch = 0;
					do {
						sortiert = true;
							for (int i = 0; i < n - 1; i++ ) {
								if(x[i]> x[i+1]) {
									tausch = x[i];
									x[i] = x[i+1];
									x[i+1] = tausch;
									sortiert = false;
								}
							}
					} while (sortiert == false);
					
				}
				System.out.println("Zahlen wurden sortiert!");
			}
			
			// Sortieren (absteigend)
			if(opt == 7) {
				if (n == 0) {
					System.out.println("Keine Zahl vorhanden!");
				}
				else {

					int tausch = 0;
					do {
							sortiert = true;
							for (int i = 0; i < n - 1; i++ ) {
								if(x[i] < x[i+1]) {
									tausch = x[i];
									x[i] = x[i+1];
									x[i+1] = tausch;
									sortiert = false;
								}
							}
					} while (sortiert == false);
					
				}
				System.out.println("Zahlen wurden sortiert!");
			}
			
			
			// Menue beenden -> Verabschiedung
			if(opt == 9) {
				System.out.println("Goodbye!");
				run = false;
			}
			
			// Array mit Random Zahlen befuellen
			if(opt == 10) {
				Random rnd = new Random();
				for(int i = n; i < x.length -1; i++) {
					x[i] = rnd.nextInt(100);
				}
				n = 100;
				System.out.println("Array befuellt!");
			}
			
		}
				
	}

}
