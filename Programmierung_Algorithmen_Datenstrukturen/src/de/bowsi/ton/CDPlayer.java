package de.bowsi.ton;

public class CDPlayer extends DigitalesMusikabspielGeraet{
	@Override
	public  void einlegen(Tontraeger tontraeger) {
		System.out.println("Fach oeffnen und CD einlegen!");
	}
	
	@Override
	public CD auswerfen() {
		return(CD) super.auswerfen();
	}
	
	@Override
	public  boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof CD; //Wenn tontraeger eine Kassette ist -> true
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		super.abspielen(tontraeger);
		System.out.println("Die Quali der CD ist echt gut!");
	}
}
