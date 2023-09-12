package de.bowsi.test;

public class Person {
	private String nachname;
	private String vorname;
	
	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public void print() {
		System.out.println("Nachname: " + nachname);
		System.out.println("Vorname: " + vorname);
	}
	
}
