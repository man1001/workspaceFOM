package de.bowsi.sub;

public class TestSubstring {

	public static void main(String[] args) {
		
		String schleimig = "Schleimiger Riesenschneckendrachen";
		
		String ergebnis =
				schleimig.substring(12,17)
		+ " " + schleimig.substring(18,19).toUpperCase() + schleimig.substring(19, 26)
		+ " " + schleimig.substring(27,28).toUpperCase() + schleimig.substring(28, 33)
		+ " " + schleimig.substring(0, 9).toLowerCase();
		
		System.out.println(ergebnis);
		
		
		
		System.out.println("Müllhalde".endsWith("halde"));
		System.out.println("Donauschifffahrt".startsWith("Donau"));
		String leckerEssen = "Pfannekuchen";
		System.out.println(leckerEssen.regionMatches(true, 2, "BadewaNne", 5, 4));

	}

}
