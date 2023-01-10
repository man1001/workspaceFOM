package de.bowsi.anwesenheit;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Mitarbeiter {
	
	// Variablen deklaration
	private String name = "";
	private float gleitzeit = 0;
	private float krankheit = 0;
	private float schulung = 0;
	private float urlaub = 0;
	
	
	// Konstruktor
	public Mitarbeiter(String name) {
		this.name = name;
	}
	
	// Tage hinzufuegen
	public void addGleitzeit(float days) {
		gleitzeit = gleitzeit + days;
	}
	
	public void addKrankheit(float days) {
		krankheit = krankheit + days;
	}
	
	public void addSchulung(float days) {
		schulung = schulung + days;
	}
	
	public void addUrlaub(float days) {
		urlaub = urlaub + days;
	}
	
	// Getter Methoden
	public String getName() {
		return name;
	}
	
	public float getGleitzeit() {
		return gleitzeit;
	}
	
	public float getKrankheit() {
		return krankheit;
	}
	
	public float getSchulung() {
		return schulung;
	}
	
	public float getUrlaub() {
		return urlaub;
	}
	
	public void ausgabeWerte() {
		System.out.println("Ausgabe");
		System.out.println("-------");
		System.out.printf("Gleitzeit: %6.2f Tage\n", getGleitzeit());
		System.out.printf("Krankheit: %6.2f Tage\n", getKrankheit());
		System.out.printf("Schulung:  %6.2f Tage\n", getSchulung());
		System.out.printf("Urlaub:    %6.2f Tage\n\n", getUrlaub());
		System.out.printf("Abwesenheit insgesamt: %6.2f Tage\n\n",getGleitzeit() + getKrankheit() + getSchulung() + getUrlaub());
	}

	public void saveData() {
		
		try {
			String fileName = name + "_data.txt";
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(getGleitzeit()+"\n");
			bw.write(getKrankheit()+"\n");
			bw.write(getSchulung()+"\n");
			bw.write(getUrlaub()+"\n");
		}catch(Exception e) {
			System.out.println("Hier ist etwas gewaltig schief gegangen!");
		}

		
		
	}
	
}
