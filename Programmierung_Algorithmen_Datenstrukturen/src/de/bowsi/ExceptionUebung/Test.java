package de.bowsi.ExceptionUebung;

public class Test {
	public static void main(String[] args) {
		int[] intarr = new int[4];
		for(int lv = 0; lv < 8; lv++) {

			try {
				intarr[lv] = lv;
				System.out.println(intarr[lv]);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array-Index " + lv + " ist zu gross!");
			}
			System.out.println("test");

		}

		
	}


}
