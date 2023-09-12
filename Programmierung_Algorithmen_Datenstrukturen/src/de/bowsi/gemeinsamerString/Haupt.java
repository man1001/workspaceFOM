package de.bowsi.gemeinsamerString;

import java.util.ArrayList;

public class Haupt {


	public static void main(String[] args) {

		boolean run = true;
		
		ArrayList<CompareString> list = new ArrayList<CompareString>();
		
		//Vergleichsmethode aufrufen:
		
		while(run == true) {
			CompareString comp = new CompareString();		
			comp.eingabeEinlesen();
			
			run = comp.testForBreakString();
			
			System.out.println("Gemeinsames Suffix ist: " +comp.compareString());
			
			list.add(comp);
			
		}
		
		
	}
	


}
