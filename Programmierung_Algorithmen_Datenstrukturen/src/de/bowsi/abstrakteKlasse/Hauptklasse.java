package de.bowsi.abstrakteKlasse;

public class Hauptklasse {

	public static void main(String[] args) {

		BMX bike = new BMX();
		bike.run();
		bike.changeGear();
		
		/*
		 * Es ist moegl. eine Referenzvariable vom allgemeinen Datentyp Bike 
		 * auf ein Objekt des Datentyps Honda zeigen zu lassen:
		 * 
		 * */
		
		Bike newBike = new Honda();
		// JVM weiss zur Laufzeit, dass die Referenzvariable newBike vom Typ Honda ist 
		// und ruft automatisch die Methode run() des Datentyps Honda auf:
		newBike.run();
		newBike.changeGear();
	}
	
	

}
