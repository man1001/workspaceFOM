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

		// Men�
		System.out.print(" Men�");
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

			System.out.println("Bitte H�he in [cm] eingeben: ");
			h = scan.nextFloat();

			a = (float) (g * h);
		}

		if (opt == 2) {
			// �berschrift
			System.out.println("Dreieck");
			System.out.println("========");

			System.out.println("Bitte Grundseite in [cm] eingeben: ");
			g = scan.nextFloat();

			System.out.println("Bitte H�he in [cm] eingeben: ");
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

		System.out.println("Fl�che ist: " + a + "cm�");

		System.out.printf("Fl�ache ist: %6.2f cm�", a);

		// Datenstrom schlie�en
		scan.close();

	}

}
