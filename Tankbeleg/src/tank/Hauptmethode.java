package tank;

import java.util.Scanner;

public class Hauptmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kmAnfang = 25000;
		int kmMenge;
		double l=0;
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		
		while (run == true) {
			System.out.println("1\tTankbeleg eingeben");
			System.out.println("0\tEnde");

			byte eingabe = scan.nextByte();
			
			if(eingabe==1) {
				// Eingabe
				System.out.println("Bitte Menge in Liter angeben:");
				l += scan.nextDouble();
				
				System.out.println("Bitte Kilometerzahl eingeben:");
				kmMenge = scan.nextInt();
				
				// Plausibilitaetspruefung
				while(kmMenge <= kmAnfang) {
					System.out.println("Eingabe darf nicht kleiner als Anfangsbetrag sein!");
					System.out.println("Bitte Kilometerzahl eingeben:");
					kmMenge = scan.nextInt();
				}
				
				System.out.printf("Durchschnitt:\t%.2f\n", ((float)(l/((kmMenge-kmAnfang)/100f))));
				System.out.println();
			} else if (eingabe==0) {
				run=false;
				System.out.println("[!]Goodbye");
			} else {
				System.out.println("Falsche Nummer bro!");
			}
			
		}


	}

}
