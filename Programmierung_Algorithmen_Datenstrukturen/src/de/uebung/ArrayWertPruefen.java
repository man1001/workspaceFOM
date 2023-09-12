package de.uebung;

public class ArrayWertPruefen {

	public static boolean aufWertPruefen(int pruefwert, int[] array) {
		boolean vorhanden = false;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == pruefwert) {
				System.out.println("Wert bei ArrayIndex ["+ i +"] vorhanden");
				vorhanden = true;
			}
			
		}
		if(!vorhanden) {
			System.out.println("Wert nicht vorhanden");
		}
		return vorhanden;
	}

}
