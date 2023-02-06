package kino.bowsi.de;

public class Hauptprogramm {

	public static void main(String[] args) {

		Kino k = new Kino(5, 50);
		
		k.setPlatzStatus(true, k.splitNumber(4250));
		k.getArray();
	}

}
