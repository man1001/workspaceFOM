package de.switchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte eine Zahl von 1-5 eingeben:");
		a = scan.nextInt();
		
		switch(a) {
			case 1: System.out.println("Das war eins");
				break;
				
			case 2: System.out.println("Das war zwei");
				break;
				
			case 3: System.out.println("Das war drei");
				break;	
			
			case 4: System.out.println("Das war vier");
				break;
				
			case 5: System.out.println("Das war fuenf");
				break;
		
		}
		
	}

}
