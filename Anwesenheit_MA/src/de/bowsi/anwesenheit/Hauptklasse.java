package de.bowsi.anwesenheit;

import java.util.Scanner;

public class Hauptklasse {
	public static void main(String[] args) {
		boolean run = true;
		int opt;
		
		Scanner scan = new Scanner(System.in);
		
		Mitarbeiter klaus = new Mitarbeiter("Klaus");
		
		do {
			System.out.println("Art der Abwesenheit:\n");
			System.out.println("1 - Gleitzeit");
			System.out.println("2 - Krankheit");
			System.out.println("3 - Schulung");
			System.out.println("4 - Urlaub");
			System.out.println("5 - Ausgabe");
			System.out.println("0 - ENDE");
			
			System.out.println("Ihre Wahl:");
			
			try {
					opt = scan.nextInt();
					
					
					// Beenden des Programms
					if(opt == 0) {
						run = false;
					}
					
					// Eingabe Gleitzeittage
					else if(opt == 1){
						System.out.println("Eingabe Gleitzeit");
						System.out.println("-----------------");
						System.out.println("Tage:");
						klaus.addGleitzeit(scan.nextFloat());
					}
					
					else if(opt == 2){
						System.out.println("Eingabe Krankheit");
						System.out.println("-----------------");
						System.out.println("Tage:");
						klaus.addKrankheit(scan.nextFloat());
					}
					
					else if(opt == 3){
						System.out.println("Eingabe Schulung");
						System.out.println("----------------");
						System.out.println("Tage:");
						klaus.addSchulung(scan.nextFloat());
					}
					
					else if(opt == 4){
						System.out.println("Eingabe Urlaub");
						System.out.println("--------------");
						System.out.println("Tage:");
						klaus.addUrlaub(scan.nextFloat());
					}
					
					else if(opt == 5) {
						klaus.ausgabeWerte();
					}
					else {
						System.out.println("Fehlerhafte Eingabe!");
					}
				
				
			} catch (Exception e) {
				System.out.println("Fehler in der Eingabe des Formats!");
				scan.next();
			}
			
		}
		while(run);
		klaus.saveData();
		System.out.println("Goodbye!");
	}


}
