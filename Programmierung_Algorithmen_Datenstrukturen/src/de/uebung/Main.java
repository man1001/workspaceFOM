package de.uebung;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gesuchterWert = 5;
		
		int[] arrayA = {10,100,5,4,103,5,555,5};
		
		int[] arrayB = {1,2,3,4};
		
		System.out.println("\nArrayA: ");
		ArrayWertPruefen.aufWertPruefen(gesuchterWert, arrayA);
		
		System.out.println("\nArrayB: ");
		ArrayWertPruefen.aufWertPruefen(gesuchterWert, arrayB);
	}

}
