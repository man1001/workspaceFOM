package bank.bowsi.de;

public class Geldmarktkonto extends Konto{
	
	//Konstruktor
	public Geldmarktkonto(String name, double kontostand, float hZins) {
		super(name, hZins, kontostand);
	}
}
