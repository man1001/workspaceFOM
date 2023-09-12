package de.bowsi.substringSuche;

public class Haupt {

	public static void main(String[] args) {

		String s1 = "Tischlerei";
		String s2 = "Tischlerei";
		System.out.println(s1);
		System.out.println(s2);
		
		String gemeinsamerSubstring = ""; // ist am Anfang leer...
		
		/*
		 * Geschachtelte Schleifen bilden viele Substrings...
		 * erst alle mit einem Buchstaben, dann alle mit zwei buchstaben usw.
		 * */
		
		for(int i = 0; i <= s1.length(); i++) {
			System.out.println("Das zuerst! " + i);
			for(int j = 0;  j <= s1.length() - i; j++) {

				/*
				 * Dieser Teilstring erweitert sich um jedes Zeichen, das BEIDE Strings am Ende
				 * enthalten wuerden:
				 * */
				String teilstring = s1.substring(j, j + i);
				System.out.println("Inex j ="+ j + " " + teilstring);
				
				if(s2.contains(teilstring)) {
					gemeinsamerSubstring = teilstring;
				}

			}
			
		}
		System.out.println("Laengester gemeinsamer Substring ist: \"" + gemeinsamerSubstring + "\"");
		
	}

}
