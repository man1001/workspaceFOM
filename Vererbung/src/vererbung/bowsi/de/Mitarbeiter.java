package vererbung.bowsi.de;

public abstract class Mitarbeiter {
	protected int gehalt;
	protected int alter;
	
	// Konstruktor
	public Mitarbeiter(int g, int a) {
		gehalt = g;
		alter = a;
	}
		
	// Methoden
	public int getGehalt() {
		return gehalt;
	}
	
	public int getAlter(){
		return alter;
	}
	
	public void wirdBefoerdert() {
		gehalt = gehalt + 400;
	}
	
	public void wirdAelter() {
		alter++;
	}
	
}

	