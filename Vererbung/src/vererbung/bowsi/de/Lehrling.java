package vererbung.bowsi.de;

public class Lehrling  extends Mitarbeiter{
	// Abgeleitete Klasse 
	
	// Konstruktor
	public Lehrling(int g, int a) {
		// Aufruf Super-Konstruktor -> Konstruktor Mitarbeiter
		super(g, a);
	}
	
	// Methoden (�bergeordnete Methode aus Mitarbeiter wird �berschrieben)
	public void wirdBefoerder() {
		gehalt = gehalt + 200;
	}
}
