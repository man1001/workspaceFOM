package bank.bowsi.de;

public class Sparkonto extends Konto{
	// Instanzvariablen
	int frist;
	
	// Konstruktor
	public Sparkonto(String name, float hZins, double kontostand, int monat) {
		super(name, hZins, kontostand);
		this.frist = monat;
	}
	
	// Methoden
	public int getFrist() {
		return frist;
	}
	
	public void setFrist(int monat) {
		frist = monat;
	}

}
