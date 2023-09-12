package de.bowsi.StiftUebung;

import java.io.IOException;

public class StiftTester {
	public static void main (String[] args) throws IOException{
		
		/* Kugelschreiber-Objekt wird einer Variable,
		 * die auf eine Objekt der Elternklasse
		 * "Stift" zeigt, zugewiesen
		 */
		
		
		Stift irgendeinStift = new Kugelschreiber("blau");
		
		// Methode gebeSchreibfarbeAus der Klasse Kugelschreiber wird ausgefuert
		irgendeinStift.gebeSchreibfarbeAus();
		
		
		irgendeinStift = new Buntstift("rot");
		/*
		 * Methode "gebeSchreibfarbeAus" der Klasse Buntstift wird ausgeführt
		 */
		
		irgendeinStift.gebeSchreibfarbeAus();
		
		/*
		 * Die Methode getClass( ist eine Instanzmethode der Klasse Object und kann damit
		 * von jeder Klasse verwendet werden
		 */
		System.out.println(irgendeinStift.getClass());
		
	}
}
