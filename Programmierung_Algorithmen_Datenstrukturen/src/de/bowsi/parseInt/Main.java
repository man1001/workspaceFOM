package de.bowsi.parseInt;

public class Main {

	public static void main(String[] args) {
		String karlHeinz = "ABC187XYZ";
		
		Parser erik = new Parser();
		
		System.out.println(erik.parseInt(karlHeinz, 3,6) );
		
		
	}
	
}
