package de.uebung;

import java.util.Random;

public class randomArray {
	Random random = new Random();
	
	public void arrayBefuellen() {
		int obergrenze = 3;
		int[] array = new int[obergrenze];
		
		
		//Verwendung java.util.Random
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		int zaehler = 0;
		int durchschnitt;
		for(int i = 0; i < array.length; i++)
		{
			zaehler = zaehler + array[i];
		}
		durchschnitt = zaehler / array.length;
		System.out.println("Durchschnitt: "+ durchschnitt);	
	}
	

}
