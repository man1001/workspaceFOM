package de.bowsi.Flugzeug;

public class Flugzeug {
	
	static int anzahlFlugzeuge;
	
	String fluggesellschaft;
	int flugnummer;
	String flugzeugtyp;
	String istZeitLandung;
	String istZeitStart;
	int landebahn = -1;
	String parkstelle;
	String sollzeitLandung;
	String sollzeitStart;
	int startbahn = -1;
	String status;
	
	public Flugzeug(String flugzeugtyp, String fluggesellschaft, int flugnummer) {
		this.flugzeugtyp = flugzeugtyp;
		this.fluggesellschaft = fluggesellschaft;
		
		anzahlFlugzeuge++;
		this.flugnummer = anzahlFlugzeuge;
		
		status = "wartend";
	}
	
	public void vergebeLandebahn(int landebahn) {
		this.landebahn = landebahn;
		status = "Landeanflug";
	}
	
	public void vergebeParkstelle(String parkstelle) {
		this.parkstelle = parkstelle;
		status = "Gelandet";
	}
	
	public void meldeGelandet(String istZeitLandung) {
		this.istZeitLandung = istZeitLandung;
		status = "Geparkt";
		
	}
	
	public void vergebeStartbahn(int startbahn) {
		this.startbahn = startbahn;
		status = "Startvorbereitung";
	}
	
	public void meldeGestartet(String istZeitStart) {
		this.istZeitStart = istZeitStart;
	}
	
	public void print() {
		System.out.println("Fluggesellschaft: " + fluggesellschaft);
		System.out.println("Flugnummer: " + flugnummer);
		System.out.println("Flugzeugtyp: " + flugzeugtyp);
		System.out.println("Startzeit(Soll): " + sollzeitStart);
		System.out.println("Landezeit(Soll): " + sollzeitLandung);
		System.out.println("Startzeit(ist): " + istZeitStart);
		System.out.println("Landezeit(ist):" + istZeitLandung);
		System.out.println("Landebahn: " + landebahn);
		System.out.println("Parkstelle: "+  parkstelle);
		System.out.println("Startbahn: " + startbahn);
		System.out.println("Status: " +  status);
	}
}
