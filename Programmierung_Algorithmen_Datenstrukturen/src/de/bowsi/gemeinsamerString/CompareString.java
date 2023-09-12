package de.bowsi.gemeinsamerString;

import java.util.Scanner;

public class CompareString {
	String zeichenkette1;
	String zeichenkette2;
	
	public CompareString() {

	}
	
	public boolean testForBreakString()
	{
		if(zeichenkette1.equalsIgnoreCase("break")) {
			return false;
		}
		return true;
	}
	
	public void eingabeEinlesen() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben sie das erste Wort ein: ");
		zeichenkette1 = scan.nextLine();
		System.out.println("Geben sie das zweite Wort ein:");
		zeichenkette2 = scan.nextLine();
		
		//Ausgabe nach Umwandlung
		zeichenkette1 = zeichenkette1.toLowerCase().trim();
		zeichenkette2 = zeichenkette2.toLowerCase().trim();
		
		
	}
	
	 public String findGemeinsamesSuffix(String text1, String text2) {
		String gemeinsamesSuffix = "";
		
		for(int i = text1.length() - 1; i >= 0 ; i--) {
			
			// Der teilstring "erweitert" sich um jedes Zeichen, das im BEIDEN Zeichenketten
			// von hinten her enthalten bzw. gleich ist
			String teilstring = text1.substring(i);
			
			if(text2.endsWith(teilstring)) {
				gemeinsamesSuffix = teilstring;
			} else {
				break; // die zu untersuchenden Zeichenketten haben keine gemeinsamen Zeichen mehr
			}
			
		}
		
		return gemeinsamesSuffix;
	}
	 
	public String compareString() {
		return findGemeinsamesSuffix(zeichenkette2, zeichenkette1);
	}
	 
}
