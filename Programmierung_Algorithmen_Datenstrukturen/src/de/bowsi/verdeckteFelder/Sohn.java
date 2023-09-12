package de.bowsi.verdeckteFelder;

public class Sohn extends Vater {
	int x = 1;
	
	public Sohn() {
		System.out.println("x des Sohnes: " + x);
		System.out.println("x des Sohnes: " + this.x);
		System.out.println("vom Vater geerbtes x: " + super.x);
		System.out.println("vom Vater geerbtes x: " + ((Vater)this).x);
	}
}
