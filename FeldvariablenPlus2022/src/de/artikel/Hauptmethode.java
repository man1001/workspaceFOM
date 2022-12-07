package de.artikel;


import java.util.Scanner;

public class Hauptmethode {

	public static void main(String[] args) {
		byte opt;
		
		Sortiment lager = new Sortiment();
		lager.readData();
		
		do {
			// Menue Aufbau:
			lager.menueAufbau();
			
			Scanner scan = new Scanner(System.in);
			
			opt = scan.nextByte();
			
			switch(opt) {
				case 0:
					lager.setArtikel();
				break;

				case 1:
					lager.sysoArray();
				break;
				
				case 2:
					lager.artikelVerkaufen();
				break;
				
				case 3:
					lager.artikelEinkaufen();
				break;
				
				case 4:
					System.out.println("Maximaler Lagewert:" + lager.getLagerwertMax());
				break;
				
				case 5:
					System.out.println("Minimaler Lagerwert:" + lager.getLagerwertMin());
				break;
				
				case 6:
					lager.getGesamtLagerwert();
				break;
				
				case 7:
					lager.getDSchnitt();
				break;
				
				case 8:
					lager.setN(0);
					System.out.println("Alle Artikel entfernt!");
				break;

				
			}
			lager.writeData();
		}
		while(opt != 9);
		
		System.out.println("Goodbye!");

	}

}
