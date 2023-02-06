package bank.bowsi.de;

/* Von der Klasse Konto abgeleitet */
public class Girokonto extends Konto{
	
	// Variablendeklaration
	float sZins;
	double limit;
	
	// Konstruktor
	public Girokonto(String name, float hZins, double kontostand, float sZins, double limit) {
		super(name, hZins, kontostand);
		this.sZins = sZins;
		this.limit = limit;
	}
	
	//Methoden
	
	// getter
	public float getSollzins() {
		return sZins;
	}
	
	public double getLimit() {
		return limit;
	}
	
	// setter
	public void setSollzins(float sZins) {
		this.sZins = sZins;
	}
	
	public void setLimit(double betrag) {
		if(betrag >= 0) {
			this.limit = betrag;
		}else {
			System.out.println("Bitte eine positiven Betrag eingeben");
		}

	}
	
	// Überschreiben der Methode auszahlung
	public boolean auszahlung(double betrag) {
		boolean ret = false;
		if(betrag > 0) {
			if(kontostand - betrag >= -limit) {
				kontostand = kontostand - betrag;
				ret = true;
				System.out.printf("Neuer Kontostand: %.2f\n", kontostand);
			} else {
				System.out.println("[!]Warnung: Überziehungslimit erreicht");
			}
		}
		else {
			System.out.println("[!]Warnung: Betrag der abgezogen werden soll muss positiv sein");
		}
		return ret;
	}
}
