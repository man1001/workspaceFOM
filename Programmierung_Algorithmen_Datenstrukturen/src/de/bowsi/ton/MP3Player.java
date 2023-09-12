package de.bowsi.ton;

public class MP3Player extends DigitalesMusikabspielGeraet{
	
	@Override
	public  void einlegen(Tontraeger tontraeger) {
		//System.out.println("Oh, eine Schallplatte. Vorsichtig auf den Drehteller legen"
		//		+ "und ganz vorsichtig aufsetzten");
	}
	
	@Override
	public MP3 auswerfen() {
		return(MP3) super.auswerfen();
	}
	
	@Override
	public  boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof MP3; //Wenn tontraeger eine Kassette ist -> true
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		//super.abspielen(tontraeger);
		System.out.println("Was soll das heissen, \"Kann Datei " + tontraeger.getTitle() + 
				".mp3 nicht finden?\"");
	}
}
