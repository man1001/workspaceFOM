package de.bowsi.vokale;

public class Haupt {

	public static void main(String[] args) {
		
		/*
		PruefString pruef = new PruefString("Abrakadabra-Simsalabim");
		System.out.println(pruef.getTestString());
		System.out.println(pruef.getVocalMap());
		*/
		

		System.out.println("K�sekuchen".indexOf('e'));
		System.out.println("K�sekuchen".indexOf("kuchen"));
		System.out.println("K�sekuchen".indexOf('e', 4)); //ab index 4
		
		System.out.println("K�sekuchen".lastIndexOf('e'));
		System.out.println("K�sekuchen".lastIndexOf("kuchen"));
		System.out.println("K�sekuchen".lastIndexOf('e', 4));
		
		
		System.out.println("Fischers Fritz fischt frische Fische".replace("isch", "lasch"));
		
		System.out.println("ischFischers Fritz fischt frische Fische".replaceAll("^isch", "lasch"));
	}

}
