package de.bowsi.StiftUebung;

public class Buntstift extends Stift{
	public Buntstift( String e) {
		schreibfarbe = e;
	}
	
	public void gebeSchreibfarbeAus() {
		System.out.println("Mein Buntstift hat die Scheibfarbe " + schreibfarbe + ", \n");
	}
}
