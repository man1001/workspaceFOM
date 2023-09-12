package de.bowsi.BruchException;

import java.util.Scanner;

public class Bruch {
	int a;
	int b;
	
	Scanner scan = new Scanner(System.in);
	
	public Bruch() {	
		try {
			System.out.println("Bitte A eingeben: ");
			a = scan.nextInt();
			
			System.out.println("Bitte B eingeben: ");
			b = scan.nextInt();
		}
		catch(Exception i) {
			System.out.println("TEST");
		}

		
		
		try {
			System.out.println("a/b=" + (a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("\u001B[31mAchtung - Sie haben eine ArtithmeticException ausgeloest!");
			System.out.println("Es gab folgendes Problem: " + e.getMessage());
			e.printStackTrace();
			System.out.println("Seien sie in Zukunft etwas vorsichtiger!\u001B[37m");
		}

		
	}
	
	public void bruchToString() {
		System.out.println("------------\n");
		System.out.println(a+"\n-\n"+b);
	}

}
