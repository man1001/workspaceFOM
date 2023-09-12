package de.bowsi.DatumException;
import java.text.ParseException;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		DatumEingabe dv = new DatumEingabe();
		String[] testdaten = {"10.10.2006", "10.13.2006", "97.2.2023", "18.1.23", "22.2.2021"};
		
		Date datum = null;
		
		for(int i = 0; i < testdaten.length; i++) {
			try {
				datum = dv.pruefeDatum(testdaten[i]);
				System.out.println("Eingegebenes Datum ist ok: \n"+ datum);
			}
			catch (ParseException e) {
				System.err.println("Eingegebenes Datum ist nicht ok: \n" + testdaten[i]);
				e.printStackTrace(System.err);
			}
		}
	}

}
