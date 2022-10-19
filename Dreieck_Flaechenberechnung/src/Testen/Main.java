package Testen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variablendeklaration
		float g = 0;
		float h = 0;
		float a = 0;

		byte opt;

		// Instanzbildung
		Scanner scan = new Scanner(System.in);

		// Menü
		System.out.print(" Menü");
		System.out.println(" ========\n");
		System.out.println(" 1 -  Rechteck");
		System.out.println(" 2 -  Dreieck");
		System.out.println(" 3 -  Kreis");
		System.out.println();
		System.out.println("Ihre Wahl?");

		opt = scan.nextByte();

		if (opt == 1) {
			System.out.println("Rechteck");
			System.out.println("========");

			System.out.println("Bitte Grundseite in [cm] eingeben: ");
			g = scan.nextFloat();

			System.out.println("Bitte Höhe in [cm] eingeben: ");
			h = scan.nextFloat();

			a = (float) (g * h);
		}

		if (opt == 2) {
			// Überschrift
			System.out.println("Dreieck");
			System.out.println("========");

			System.out.println("Bitte Grundseite in [cm] eingeben: ");
			g = scan.nextFloat();

			System.out.println("Bitte Höhe in [cm] eingeben: ");
			h = scan.nextFloat();

			a = (float) 0.5 * (float) (g * h);

		}

		if (opt == 3) {
			System.out.println("Kreis");
			System.out.println("========");

			System.out.println("Bitte Radius in [cm] eingeben: ");
			g = scan.nextFloat();

			a = (float) (Math.PI * (Math.pow((double) g, 2)));
			System.out.println(a);
		}

		// Ausgabe

		System.out.println("Fläche ist: " + a + "cm²");

		System.out.printf("Fläache ist: %6.2f cm²", a);

		// Datenstrom schließen
		scan.close();

	}

}
