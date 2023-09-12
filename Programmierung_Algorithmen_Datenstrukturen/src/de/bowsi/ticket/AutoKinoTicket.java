package de.bowsi.ticket;

public class AutoKinoTicket extends Kinoticket{
	
	int anzahlPersonen;
	
	//Konstruktor
	public AutoKinoTicket(String eventOrt, String eventName, double basispreis, int filmDauer, int anzahlPersonen) {
		super(eventOrt, eventName, basispreis, filmDauer);
		this.anzahlPersonen = anzahlPersonen;
	}
	
	public double berechneTicketpreis() {
		ticketpreis = super.berechneTicketpreis() * anzahlPersonen;
		return ticketpreis;
	}
	
}
