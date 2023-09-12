package de.bowsi.ticket;

public class KonzertTicket extends Ticket {
	int sitzreihe;
	
	//Schreiben Sie einen passenden Konstrktor
	public KonzertTicket(String eventOrt, String eventName, double basispreis, int sitzreihe) {
		super(eventOrt, eventName, basispreis);
		this.sitzreihe = sitzreihe;
	}
	
	// Abstrakte Methode der Klasse Ticket implementiert:
	public double berechneTicketpreis() {
		ticketpreis = basispreis * (1 + 1/sitzreihe);
		return ticketpreis;
	}
}
