package de.bowsi.Foto;

public class Objektiv {
	private int brennweiteMax;
	private int brennweiteMin;
	
	public Objektiv() {
		
	}
	
	public Objektiv(int brennweiteMin,int brennweiteMax) {
		if(brennweiteMin >= 1 && brennweiteMax <= 1000 && brennweiteMin < brennweiteMax ) {
			this.brennweiteMin = brennweiteMin;
			this.brennweiteMax = brennweiteMax;
		}
		else {
			System.out.println("Ungueltige Eingabe!");
		}	
	}
	
	
	public void setBrennweite(int brennweiteMin,int brennweiteMax) {
		if(brennweiteMin >= 1 && brennweiteMax <= 1000 && brennweiteMin < brennweiteMax ) {
			this.brennweiteMin = brennweiteMin;
			this.brennweiteMax = brennweiteMax;
		}
		else {
			System.out.println("Ungueltige Eingabe!");
		}	
	}
	
	public int getBrennweiteMax() {
		return brennweiteMax;
	}
	
	public int getBrennweiteMin() {
		return brennweiteMin;
	}
	
}
