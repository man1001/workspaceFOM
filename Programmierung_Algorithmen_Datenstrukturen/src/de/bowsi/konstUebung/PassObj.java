package de.bowsi.konstUebung;

public class PassObj {
	
	public static void main(String[] args) {
		
		Test ob1 = new Test(100, 22);
		Test ob2 = new Test(100, 22);
		Test ob3 = new Test(-1, -1);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
	}
	
}
