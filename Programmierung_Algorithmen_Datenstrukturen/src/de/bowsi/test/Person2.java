package de.bowsi.test;

public class Person2 {
	protected String nachname;
	protected String vorname;
	
	public Person2(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		
	
	}
	
	public void print() {
		System.out.println("Nachname: " + nachname);
		System.out.println("Vorname: " + vorname);
	}
}
