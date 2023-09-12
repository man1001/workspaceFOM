package de.bowsi.ton;

public abstract class Musikabspielgeraet {
	// Wier haben die Klasse Tontraeger ja auch noch -> hier eine Objektvariable vom passenden Typ
	private Tontraeger tontraeger;
	
	public abstract void einlegen(Tontraeger tontraeger);
	
	public abstract void abspielen(Tontraeger tontraeger);
	//public abstract Tontraeger auswerfen(Tontraeger tontraeger);
	public abstract boolean unterstuetztTontraeger(Tontraeger tontraeger);
	
	// Diese Methode wird vorgegeben/implementiert
	public final void hoeren(Tontraeger tontraeger) {
		// Pruefen ob ein bestimmter Tontraeger von einem Abspielgeraet ueberhaupt
		// unterstuezt wird
		
		if(this.unterstuetztTontraeger(tontraeger)) {
			this.tontraeger = tontraeger;
			this.einlegen(tontraeger);
			this.abspielen(tontraeger);
			System.out.println();
		}else {
			System.out.println(this.getClass().getSimpleName() + " unterstuetzt den Tontraeger " +
					tontraeger.getClass().getSimpleName() + " nicht."
					);
		}
	}
	
	//Beim Auswerfen wird die Referenzvariable eines Tontraegers 
	// erst auf null gesetzt und dann zurückgegeben
	
	public Tontraeger auswerfen() {
		this.tontraeger = null;
		return tontraeger;
	}

}
