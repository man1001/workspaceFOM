package de.bowsi.IOUebung;
import java.io.Serializable;

public class Buch implements Serializable{
	String titel;
	double preis;
	
	public Buch(String titel, double preis) {
		this.titel = titel;
		this.preis = preis;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public double getPreis() {
		return preis;
	}

}
