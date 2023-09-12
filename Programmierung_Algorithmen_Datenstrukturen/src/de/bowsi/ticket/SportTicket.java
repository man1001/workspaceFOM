package de.bowsi.ticket;

public class SportTicket extends Ticket {
	
	//Ermittlung des Preises haengt ab von der Pokalstufe
	int pokalstufe;
	
	//Konstruktor
	public SportTicket(String eventOrt, String eventName, double basispreis, int pokalstufe) {
		super(eventOrt, eventName, basispreis);
		this.pokalstufe = pokalstufe;
	}
	
	public double berechneTicketpreis() {
		ticketpreis = basispreis + (pokalstufe * 10);		
		return ticketpreis;
	}
	
}
