package de.bowsi;

import java.util.Scanner;

public class Pkw {
	// Variablen deklaration
	private int kmStand;
	private float tankInhalt;
	private float tankVolumen;
	private float verbrauch;
	
	// Variablen Initialisierung
	

	
	public Pkw(){
	kmStand = 10;
	tankInhalt = 5.0f;
	tankVolumen = 60.0f;
	verbrauch = 6.4f;
	}
	
	// Konstruktor 
	public Pkw(int kmS, float tI, float tV, float v) {
		kmStand = kmS;
		tankInhalt = tI;
		tankVolumen = tV;
		verbrauch = v;
		
	}
	
	// Scanner Instanziierung
	Scanner scan = new Scanner(System.in);
	
	
	// Getter Methode Kilometerstand
	
	public int getKmStand() {
		return kmStand;
	}
	
	public float getTankInhalt() {
		return tankInhalt;
	}
	
	// Methode zum Fahren
	public void fahren() {
		int km;
		System.out.println("Wie viele KM wollen sie fahren?");
		km = scan.nextInt();
		if((tankInhalt - (verbrauch * km)/100) < 0) {
			System.out.println("Zu wenig Benin!");
		}
		else {
			kmStand = kmStand +km;
			tankInhalt = tankInhalt - (verbrauch * km)/100;
		}

	}
	
	// Methode zum Tanken
	public int tanken() {
		System.out.println("Wie viele Liter wollen sie tanken?");
		float liter = scan.nextFloat();
		if(liter > 0 && (tankInhalt + liter) < this.tankVolumen) {
			tankInhalt = tankInhalt + liter;
			System.out.printf("Es wurden %.2f l getankt\n", liter);
			System.out.printf("Neuer Tankinhalt: %.2f l\n", tankInhalt);
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public int tanken(float l) {
		if(l > 0 && (tankInhalt + l) < this.tankVolumen) {
			tankInhalt = tankInhalt + l;
			System.out.printf("Es wurden %.2f l getankt\n", l);
			System.out.printf("Neuer Tankinhalt: %.2f l\n", tankInhalt);
			return 0;
		}
		else {
			return -1;
		}
	}
	
	// Methode zum Aufbau des Menues
	public int runMenue() {
		String input;
		int eingabe = 0;
		
		System.out.println("1 - fahren");
		System.out.println("2 - tanken");
		System.out.println("3 - Daten anzeigen");
		System.out.println("4 - ENDE");
		

			System.out.println("Ihre Wahl:");
			input = scan.next();
			eingabe = Integer.parseInt(input);
	
		return eingabe;
	}
	
	
	// Methode zum abwarten einer User-Eingabe
	public void waitKeyPress() {
        try
        {
        	System.out.println("\nZum fortfahren Eingabetaste drücken...");
            System.in.read();
            scan.nextLine();
        }  
        catch(Exception e)
        {
        	System.out.println("Ungueltige Eingabe!");
        }  
	}
	
	// Methode Reichweite
	public float getReichweite() {
		float reichweite;
		reichweite = (tankInhalt / verbrauch) * 100;
		return reichweite;
	}
	
	
}
