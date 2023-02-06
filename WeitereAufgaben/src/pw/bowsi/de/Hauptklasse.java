package pw.bowsi.de;

import java.util.Scanner;

public class Hauptklasse {

	public static void main(String[] args) {
		// Variablendeklaration
		String pw;
		byte countU = 0;
		byte countL = 0;
		byte countD = 0;
		boolean pwSafe = false;
		
		System.out.println("Neues Passwort");
		Scanner scan = new Scanner(System.in);
		
		pw = scan.next();

		
		for(int i = 0; i < pw.length(); i++) {
			if(Character.isUpperCase(pw.charAt(i))){
				countU++;
			}
			
			if(Character.isLowerCase(pw.charAt(i))) {
				countL++;
			}
			
			if(Character.isDigit(pw.charAt(i))) {
				countD++;
			}
		}
		
		
		if(countU < 1) {
			System.out.println("[!]Nicht genügend Großbuchstaben!");
		}
		
		if(countL < 1) {
			System.out.println("[!]Nicht genügend Kleinbuchstaben!");
		}
		
		if(countD < 1) {
			System.out.println("[!]Nicht genügend Ziffern!");
		}
		
		if(pw.length() < 8) {
			System.out.println("[!]Passwort zu kurz!");
		}
		
		
		
		if(countU >= 1 && countL >=1 && countD >=1 && pw.length() >= 8) {
			pwSafe = true;
			System.out.println("[!]Passwort ist sicher!");
		} else {
			System.out.println("[!]Passwort ist unsicher!");
		}
		
		scan.close();
	}

}
