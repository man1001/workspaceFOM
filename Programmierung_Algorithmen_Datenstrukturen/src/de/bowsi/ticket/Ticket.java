package de.bowsi.ticket;

abstract class Ticket {
	double basispreis;
	double ticketpreis;
	String eventName;
	String eventOrt;
	
	// Konstruktor, den alle Subklassen nutzen koennen
	
	public Ticket(String eventOrt, String eventName, double basispreis) {
		this.eventOrt = eventOrt;
		this.eventName = eventName;
		this.basispreis = basispreis;
	}
	
	public abstract double berechneTicketpreis();
	
	public void printTicketdaten() {
		String text;
		text = "Eventort: " + eventOrt;
		text += ", Eventname: " + eventName;
		text += ", Ticketpreis: " + ticketpreis + " Euro";
		System.out.println(text);
	}
}
