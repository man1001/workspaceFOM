package de.bowsi.thisBruch;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public void bruchAusgeben() {
		
		if(nenner == 0) {
			System.out.println("Nenner darf nicht 0 sein!");
		}
		else {
			System.out.println(zaehler + "/" + nenner);
			System.out.println("Dezimal: " + (double)(zaehler)/(double)(nenner));
		}
	}
	
	public Bruch setzeWerte (int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		return this;
	}
	
	public Bruch multipliziere(int faktor) {
		setzeWerte (zaehler * faktor, nenner);
		return this;
	}
}
