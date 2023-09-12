package de.bowsi.staticTest;

public class StaticBlock {
	public static int anzahl = 0;
	
	public static int anzahlAufrufeStaticBlock = 0;
	
	static {
		System.out.println(" * Betreten des statischen Blocks *");
		anzahlAufrufeStaticBlock++;
	}
}
