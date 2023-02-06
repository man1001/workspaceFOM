package bank.bowsi.de;

// abstrakte Basisklasse (Vererbung an untergeordnete Klassen)
public abstract class Konto {
	
	// Variablen deklaration
	static int globalId = 0;
	int id;
	String inhaber;
	double kontostand;
	float hZins;
	
	
	// Konstruktor
	public Konto(String name, float hZins, double kontostand) {
		id = globalId;
		inhaber = name;
		this.kontostand = kontostand;
		this.hZins = hZins;
		globalId++;
	}
	
	// Methoden
	
	// getter Methoden
	public String getInhaber() {
		return inhaber;
	}
	
	public int getId() {
		return id;
	}
	
	
	public double getKontostand() {
		return kontostand;
	}
	
	public float getHabenZins(){
		return hZins;
	}
	
	// setter Methoden
	public void setHabenZins(float hZins) {
		this.hZins = hZins;
	}
	
	// Methode zur Einahlung
	public void einzahlung(double betrag) {
		if(betrag > 0) {
			kontostand = kontostand + betrag;
			System.out.printf("Neuer Kontostand: %.2f\n", kontostand);
		}
		
		else {
			System.out.println("[!]Warnung: Betrag der hinzugefügt werden soll muss positiv sein");
		}
		
	}
	
	// Methode zur Auszahlung
	public boolean auszahlung(double betrag) {
		boolean ret = false;
		
		if(betrag > 0){
			if(kontostand-betrag > 0) {
				kontostand = kontostand - betrag;
				System.out.printf("Neuer Kontostand: %.2f\n", kontostand);
				
				ret = true;
				
			} else {
				System.out.println("Konto nicht gedeckt!");
			}
		}	
		else {
			System.out.println("[!]Warnung: Betrag der abgezogen werden soll muss positiv sein");
		}
		return ret;
	}
	
	
	
	
	
	
	
	

}
