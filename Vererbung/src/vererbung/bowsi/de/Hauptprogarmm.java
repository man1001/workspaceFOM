package vererbung.bowsi.de;

public class Hauptprogarmm {

	public static void main(String[] args) {


		// Instanzbildung
		Lehrling paul = new Lehrling(1200, 17);
		Angestellter kaiser = new Angestellter(4500, 34);
		Abteilungsleiter boss = new Abteilungsleiter(5600, 50);
		
		// Gehaltsausgabe
		System.out.printf("Paul verdient: %s€\n", paul.getGehalt());
		System.out.printf("Herr Kaiser verdient: %s€\n", kaiser.getGehalt());
		System.out.printf("Frau Boss verdient: %s€\n", boss.getGehalt());
	}

}
