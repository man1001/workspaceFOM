package de.bowsi.ton;

public abstract class AnalogesMusikabspielGeraet extends Musikabspielgeraet{
	
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Hier der analoge Tontraeger: " + tontraeger.getTitle() + ", und der ist voll.");
	}
	
	
}
