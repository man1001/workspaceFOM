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
		
		while (run= true) {
			System.out.println("1\tTankbeleg eingeben");
			System.out.println("0\tEnde");
			
			byte eingabe = scan.nextByte();
			
			if(eingabe==1) {
				System.out.println("Bitte Menge in Liter angeben:\n");
				l += scan.nextDouble();
				System.out.println("Bitte Kilometerzahl eingeben:");
				kmMenge = scan.nextInt();
				
				System.out.printf("Durchschnitt:\t%.2f\n", ((float)(l/((kmMenge-kmAnfang)/100f))));
			} else if (eingabe==0) {
				run=false;
			} else {
				System.out.println("Falsche Nummer bro!");
			}

			
			
		}
		
		
		
	}

}
