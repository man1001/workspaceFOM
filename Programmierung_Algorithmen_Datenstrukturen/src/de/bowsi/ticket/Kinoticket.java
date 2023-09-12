package de.bowsi.ticket;

public class Kinoticket extends Ticket {
	int filmDauer;
	
	// Konstruktor
	public Kinoticket(String eventOrt, String eventName, double basispreis, int filmDauer) {
		super(eventOrt, eventName, basispreis);
		this.filmDauer = filmDauer;
	}
	
	
	
	public double berechneTicketpreis() {
		ticketpreis = basispreis;
		if(filmDauer > 150) {
			ticketpreis = ticketpreis + 5;
		}		
		return ticketpreis;
	}
	
}
