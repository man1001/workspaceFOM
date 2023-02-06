package enc.bowsi.de;

import java.util.Scanner;

public class Verschluesselung {

	public static void main(String[] args) {
		
		String wort;
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String code = "UWJGLZQRXPOFDAHMKSICYTVENB";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Passwort eingeben: ");
		wort = scan.next();
		
		Helfer h = new Helfer();
		System.out.println(h.encryptChar(wort, alpha, code));

		

		

	}

}
