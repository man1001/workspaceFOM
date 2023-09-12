package de.bowsi;

public class Punkt {
	private int x;
	private int y;
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void zeichne() {
		System.out.println("Punkt:" + x + "/" + y);
	}
	
	public void verschiebe(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void loesche() {

	}
	
}
