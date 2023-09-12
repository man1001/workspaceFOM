package de.bowsi.test;

public class Student2 extends Person2 {
	
	private int matrikelnummer;
	
	public Student2(String vorname, String nachname, int matrikelnummer) {
		super(vorname, nachname);
		this.matrikelnummer = matrikelnummer;
	}
	
	public void print() {
		super.print();
		System.out.println("Matrikelnummer: " + matrikelnummer);
	}


}
