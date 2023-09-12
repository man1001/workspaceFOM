package de.bowsi.ton;

public class SchallplattenSpieler extends AnalogesMusikabspielGeraet{
	
	@Override
	public  void einlegen(Tontraeger tontraeger) {
		System.out.println("Oh, eine Schallplatte. Vorsichtig auf den Drehteller legen "
				+ "und ganz vorsichtig aufsetzten");
	}
	
	@Override
	public Schallplatte auswerfen() {
		return(Schallplatte) super.auswerfen();
	}
	
	@Override
	public  boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof Schallplatte; //Wenn tontraeger eine Kassette ist -> true
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		super.abspielen(tontraeger);
		System.out.println("Oha, die Schallplatte klingt aber gut!");
	}
	
}
