package vererbung.bowsi.de;

public class Abteilungsleiter extends Mitarbeiter{
	// Abgeleitete Klasse 
	
	// Konstruktor
	public Abteilungsleiter(int g, int a) {
		// Aufruf Super-Konstruktor -> Konstruktor Mitarbeiter
		super(g, a);
	}
	
	public void wirdBefoerdert() {
		gehalt = gehalt + 1000;
	}

}
