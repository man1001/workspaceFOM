package de.analyse;

public class EigeneMethode {

	public static int summe(int[] x, int n){
		int sum = 0;
		for(int i = 0; i< n; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	
}