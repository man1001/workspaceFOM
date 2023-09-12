package de.bowsi.ton;

public class KassettenRekorder extends AnalogesMusikabspielGeraet{
	// Welche Methoden muessen implementiert werden?
	
	@Override
	public  void einlegen(Tontraeger tontraeger) {
		System.out.println("Rekorder oeffnen, vorsichtig Kassete einlegen, Fach schließen");
	}
	
	@Override
	public Kassette auswerfen() {
		return(Kassette) super.auswerfen();
	}
	
	@Override
	public  boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof Kassette; //Wenn tontraeger eine Kassette ist -> true
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		super.abspielen(tontraeger);
		System.out.println("Na, die Quali ist aber nich so doll");
	}
	
}
