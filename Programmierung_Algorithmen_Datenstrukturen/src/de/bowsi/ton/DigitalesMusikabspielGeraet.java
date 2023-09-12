package de.bowsi.ton;

public abstract class DigitalesMusikabspielGeraet extends Musikabspielgeraet{
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Hier der digitale Tontraeger: " 
		+ tontraeger.getTitle() + ", und der ist voll.");
	}
	
	
}
