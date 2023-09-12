package de.bowsi.verdeckteFelder;

public class Sohn2 extends Vater2{
	String x  = "Ich bin der Sohn";
	
	public Sohn2() {
		System.out.println("x des Sohnes: " + x);
		System.out.println("x des Sohnes: " + this.x);
		System.out.println("vererbtes x vom Vater: " + super.x);
		System.out.println("ererbtes x vom Vater : " + ((Vater2) this).x);
		System.out.println("ererbtes x vom Grossvater: " + ((Grossvater2)this).x);

	}
	
}
