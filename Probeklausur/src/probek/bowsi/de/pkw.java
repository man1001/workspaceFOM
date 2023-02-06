package probek.bowsi.de;

// erster Fehler private statt public
public class pkw {
	/* Instanzvariablen (Eigenschaften) */
	private int kmStand;
	private float tankInhalt;
	private float tankVolumen;
	private float verbrauch;

	/* Konstruktor */
	// falscher Name für Konstruktor
	public pkw()
	{
		kmStand = 10;
		tankInhalt = 5.0f;
		// Fehlendes f nach dem Float wert
		tankVolumen = 60.0f;
		verbrauch = 6.4f;
	}

	/* Getter-Methoden (zum Abfragen von Daten) */
	public int get_kmStand() {
		// km statt kmStand
		return kmStand;
	}

	public float get_tankInhalt() {
		return tankInhalt;
	}

	/* Allgemeine Methoden (was kann man mit einem Auto machen) */
	public void fahren(int km)
	{
		if (tankInhalt - verbrauch * km /100 > 0)
		{
			System.out.printf("\n So weit kommen Sie nicht mehr!");
			System.out.printf("\n");
		}
		else
		{
			// fehlender Strichpunkt
			kmStand = kmStand + km;
			tankInhalt = tankInhalt - verbrauch * km /100;
		}
	}

	// float als rückgabewert -> muss void sein
	public void tanken(float liter) {
		if (tankInhalt + liter > tankVolumen) {
			System.out.printf("\n So viel passt nicht mehr rein!");
			// \n 
			System.out.printf("\n");
		} else {
			tankInhalt = tankInhalt + liter;
		}
	}
}
