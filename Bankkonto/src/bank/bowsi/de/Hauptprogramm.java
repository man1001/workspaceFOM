package bank.bowsi.de;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Hauptprogramm {

	public static void main(String[] args) {
		byte opt = 0;
		double tmp = 0;
		
		// Instanzbildung
		Girokonto meinGiro = new Girokonto("Manu", 0.0f, 2500, 0.20f, 1000);
		Sparkonto meinSpar = new Sparkonto("Hans", 0.1f, 0, 3 );
		Geldmarktkonto meinGeld = new Geldmarktkonto("Franz", 0, 1.5f);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(meinGiro.getId() + " " + meinSpar.getId() + " " + meinGeld.getId());
		
		// Menü-Aufbau
		
		do {
			System.out.println("Meine Bankkonten");
			System.out.println("================");
			System.out.println("1 - Kontoübersicht");
			System.out.println("2 - Auszahlung am Geldautomat");
			System.out.println("3 - Einzahlung am Geldautomat");
			System.out.println("4 - Umbuchung vom Girokonto auf das Sparkonto");
			System.out.println("5 - Umbuchung vom Girokonto auf das Geldmarktkonto");
			System.out.println("6 - Umbuchung vom Sparkonto auf das Girokonto");
			System.out.println("7 - Umbuchung vom Geldmarktkonto auf das Girokonto");
			System.out.println("8 - Überziehungslimit ändern");
			System.out.println("9 - Zinsberechnung");
			System.out.println("0 - ENDE");
			
			System.out.println("Ihre Wahl: ");
			opt = scan.nextByte();
			
			
			switch(opt) {
			
		
				case 1:
					System.out.println("Kontenübersicht");
					System.out.println("===============");
					System.out.println("Girokonto:");
					System.out.printf("ID: %d Name: %s Habenzins: %.5f Sollzins %.5f limit: -%.0f Kontostand: %.2f\n\n", meinGiro.getId(), meinGiro.getInhaber(), meinGiro.getHabenZins(), meinGiro.getSollzins(), meinGiro.getLimit(), meinGiro.getKontostand());
					break;
				
				case 2:


					
					System.out.println("Auszahlung am Geldautomat");
					System.out.println("=========================");
					System.out.println("Auszuzahlender Betrag: ");
					tmp = scan.nextDouble();
					meinGiro.auszahlung(tmp);
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				case 7:
					break;
					
				case 8:
					
					System.out.println("Überziehungslimit ändern");
					System.out.println("========================");				
					System.out.println("Neues Limit: ");
					tmp = scan.nextDouble();
					
					meinGiro.setLimit(tmp);
					
					break;
					
				case 9:
					break;
								
			}
		}
		while(opt != 0);
		System.out.println("Goodbye!");
		scan.close();
	}


}
