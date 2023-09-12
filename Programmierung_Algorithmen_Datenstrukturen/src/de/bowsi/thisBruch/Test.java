package de.bowsi.thisBruch;

public class Test {

	public static void main(String[] args) {

		Bruch b = new Bruch(4,6);
		b.bruchAusgeben();
		
		
		Bruch c = new Bruch(5,6);
		c.setzeWerte(4, 2).bruchAusgeben();

		c.multipliziere(6).bruchAusgeben();

	}
}