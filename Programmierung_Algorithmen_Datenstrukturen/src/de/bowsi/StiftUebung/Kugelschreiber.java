package de.bowsi.StiftUebung;

public class Kugelschreiber extends Stift{
	
	public Kugelschreiber(String e) {
		schreibfarbe = e;
	}
	
	public void gebeSchreibfarbeAus() {
		System.out.println("Schreibfarbe des Kugelschreibers ist " + schreibfarbe + ", \n");
	}
	
	
}
