package de.bowsi.ton;

public abstract class Tontraeger {
	String title;
	
	public Tontraeger() {
		
	}
	
	public Tontraeger(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
