package de.awtTest;



public class Test{
	public static void main(String[] args){	
		String eins = "Erster String ";
		String zweiter = "und hier der zweite Teil.";
		
		String zusammen = eins.concat(zweiter);
		System.out.println(zusammen);
		
		System.out.println(zusammen.charAt(5));
	}
	
}
