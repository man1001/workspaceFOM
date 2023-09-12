package de.uebung;

public class ArrayKopieren {

	
	int[] arrayA = {1,2,3,4,5};
	int[] arrayB = new int[arrayA.length];
	
	public void transferArray() {
		for(int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}
	}
	
	public int[] getArrayA() {
		return arrayA;
	}
	
	public int[] getArrayB() {
		return arrayB;
	}
	
	
	public void getArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
