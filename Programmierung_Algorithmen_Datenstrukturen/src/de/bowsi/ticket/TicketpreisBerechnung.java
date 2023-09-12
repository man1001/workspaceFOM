package de.bowsi.ticket;

public class TicketpreisBerechnung {
	
	//Gesamtumsatz Tickets
	private static double umsatz;
	
	// Array aller verkauften Tickets
	private static Ticket[] vTickets;
	
	// Konstante fuer Array-Dimension, Anzahl der Tickets
	private static final int ANZ_TICKETS;
	
	//statischer Initblock fuer Initialisierung der statischen Variablen:
	
	static {
		umsatz = 0;
		ANZ_TICKETS = 10;
		vTickets = new Ticket[ANZ_TICKETS];
	}
	
	
	public static void main(String[] args) {
		vTickets[0] = new SportTicket("LONDON", "CHE-MAN", 50, 4); 	// Chelsea-Manchester
	     vTickets[1] = new KonzertTicket("BERLIN", "BACH", 74, 37);
	     vTickets[2] = new Kinoticket("DRESDEN", "HONEY", 9, 165);
	     vTickets[3] = new AutoKinoTicket("PRAG", "E.T.", 5, 115, 4);
	     vTickets[4] = new SportTicket("ERFURT", "ERF-DYN", 12, 0);		//Erfurt-Dynamo Dresden
	     vTickets[5] = new KonzertTicket("STUTTGART", "TARZAN", 99, 8);
	     vTickets[6] = new SportTicket("BARCELONA", "BAR-MAD", 125, 7);	//Barcelona-Madrid
	     vTickets[7] = new KonzertTicket("PORTO", "MARIA PIRES", 79, 1);
	     vTickets[8] = new AutoKinoTicket("MOSKAU", "AVATAR", 9, 162, 2);
	     vTickets[9] = new Kinoticket("PARIS", "PANEM", 10, 142);
	     
	     
	     for(int i = 0; i < vTickets.length; i++) {
	    	 umsatz = umsatz + vTickets[i].berechneTicketpreis();
	    	 
	     }
	     
	     System.out.println("------------------ Ausgabe Ticketdaten ------------------");
	     for(Ticket item: vTickets) {
	    	 item.printTicketdaten();
	    	 
	     }
	     
	     System.out.println("\nUmsatz: " + umsatz + "Euro");
	     
	    
	}
}
