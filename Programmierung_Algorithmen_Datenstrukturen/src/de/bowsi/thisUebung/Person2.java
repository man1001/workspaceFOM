package de.bowsi.thisUebung;

public class Person2 {
	private int alter;
	
	public void print() {
		this.printSterne();
		System.out.println("Alter: " + this.alter);
		this.printSterne();
	}
	
	private void printSterne() {
		System.out.println("*************");
	}
	
	public void setzeAlter(int alt) {
		this.alter = alt;
	}
}
