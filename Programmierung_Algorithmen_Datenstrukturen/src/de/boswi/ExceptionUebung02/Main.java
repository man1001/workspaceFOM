package de.boswi.ExceptionUebung02;

import de.bowsi.Foto.Fotoapparat;

public class Main {
	public static void main(String[] args) {
		Fotoapparat f = new Fotoapparat("Kanon", 5, 100);
		f.setObjektiv(20, 200);
		System.out.println("Maximale Brennweite: " + f.getObjektiv().getBrennweiteMax() + " mm");
		System.out.println("Minimale Brennweite: " + f.getObjektiv().getBrennweiteMin() + " mm");

		System.out.println(f.toString());
	}

}
