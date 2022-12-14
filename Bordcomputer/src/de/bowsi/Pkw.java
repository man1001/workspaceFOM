package de.bowsi;

import java.util.Scanner;


import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

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
	
	
	// Getter Methoden
	
	//Kilometerstand
	public int getKmStand() {
		return kmStand;
	}
	
	// Tankinhalt
	public float getTankInhalt() {
		return tankInhalt;
	}
	
	// Methode Reichweite
	public float getReichweite() {
		float reichweite;
		reichweite = (tankInhalt / verbrauch) * 100;
		return reichweite;
	}
	
	// Methode zum Fahren
	public int fahren() {
		int km;
		System.out.println("Wie viele KM wollen sie fahren?");
		km = scan.nextInt();
		if((tankInhalt - (verbrauch * km)/100) < 0) {

			return -1;
		}
		else {
			kmStand = kmStand +km;
			tankInhalt = tankInhalt - (verbrauch * km)/100;
			System.out.printf("Sie sind %d gefahren", km);
			System.out.printf("Der Tank enthält noch %.2f l.", tankInhalt);
			return 0;
		}

	}
	
	// Methode zum Tanken
	public int tanken() {
		System.out.println("Wie viele Liter wollen sie tanken?");
		float liter = scan.nextFloat();
		if(liter > 0 && (tankInhalt + liter) <= this.tankVolumen) {
			tankInhalt = tankInhalt + liter;
			System.out.printf("Es wurden %.2f l getankt\n", liter);
			System.out.printf("Neuer Tankinhalt: %.2f l\n", tankInhalt);
			return 0;
		}
		else {
			return -1;
		}
	}
	
	// Methode zum Tanken -> Ueberladene Methode 
	public int tanken(float l) {
		if(l > 0 && (tankInhalt + l) <= this.tankVolumen) {
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
		
		System.out.println("1 - Fahren");
		System.out.println("2 - Tanken");
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
	
	// Methode zum Speicher der Werte in einer Textdatei
	public void safeData() {
		
		try {
			FileWriter fw = new FileWriter("Data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(kmStand + "\n");
			bw.write(tankInhalt + "\n");
			bw.write(tankVolumen + "\n");
			bw.write(verbrauch + "\n");
			
			bw.close();
			fw.close();
			System.out.println("Daten in Datei geschrieben!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something really bad happend!");
			e.printStackTrace();
		}
		
	}
	
	public void readData() {
		String filePathString = "Data.txt";
		File f = new File(filePathString.trim());
		
		if(f.isFile()) {
			try {
				FileReader fr = new FileReader("Data.txt");
				BufferedReader br = new BufferedReader(fr);
				
				kmStand =  Integer.parseInt(br.readLine());
				tankInhalt = Float.parseFloat(br.readLine());
				tankVolumen = Float.parseFloat(br.readLine());
				verbrauch = Float.parseFloat(br.readLine());
				
				br.close();
				fr.close();
				System.out.println("Gespeicherte Daten eingelesen!");
				
			}
			catch(IOException e){
				System.out.println("Something really bad happend!");
				e.printStackTrace();
			}
		}
			
		
	}
	
	
}
