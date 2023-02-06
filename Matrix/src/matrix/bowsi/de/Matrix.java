package matrix.bowsi.de;

import java.util.Scanner;

public class Matrix {
	int zeilen;
	int spalten;
	int [][] mArray;
	
	public Matrix(int a, int b) {
		mArray = new int[a][b];
		zeilen = a;
		spalten = b;
	}

	Scanner scan = new Scanner(System.in);
	
	// Zahlen einlesen
	
	public void addNum() {
		
		for(int i = 0; i < zeilen; i++) {
			for(int j = 0; j < spalten; j++) {
				System.out.printf("Eingabe Wert [%d][%d]: ", i+1, j+1);
				mArray[i][j] = scan.nextInt();
			}

		}
		
	}
	
	public void getArray() {
			
		for(int i = 0; i < zeilen; i++) {
 		System.out.println();
			for(int j = 0; j < spalten; j++) {
				System.out.printf("%4d", mArray[i][j]);

			}
		
		}
		
	}
	
	
}
