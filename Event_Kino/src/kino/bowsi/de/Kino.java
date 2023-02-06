package kino.bowsi.de;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Kino {
	
	// Variablendeklaration
	boolean[][] saal;
	int zeilen;
	int spalten;
	
	// Konstruktor
	public Kino(int zeilen, int spalten) {
		
		// Initialisierung array
		saal = new boolean[zeilen][spalten];
		this.zeilen = zeilen;
		this.spalten = spalten;	
	}
	
	// Ausgabe gesammtes Array
	public void getArray() {
		for(int i = 0; i < zeilen; i++) {
			System.out.println();
			for (int j = 0; j < spalten; j++) {
				if(saal[i][j] == false) {
					System.out.print(" 0");
				}
				else {
					System.out.print(" X");
				}
				
			}
		}
		System.out.println();
	}
	
	public void setPlatzStatus(boolean b, int i, int j) {
		saal[j][j] = b;
	}
	
	public void setPlatzStatus(boolean b, int[] i) {
		if(i[0]>= saal[0].length) {
			System.out.print("Fehler");
		} 
		else {
		saal[i[0]][i[1]-1] = b;
		}
	}
	
	public int[] splitNumber(int n) {
		
		String tmpString = String.valueOf(n);
		String tmpStringA = "";
		String tmpStringB = "";
		
		int[] result = new int[2];
		
		if(tmpString.length() == 1) {
			tmpStringA = "0";
			tmpStringB = String.valueOf(n).substring(0,1);
		}
		
		if(tmpString.length() == 2) {
			tmpStringA = "0";
			tmpStringB = String.valueOf(n).substring(0,2);

		}
		if(tmpString.length() == 3){
			tmpStringA = String.valueOf(n).substring(0,1);
			tmpStringB = String.valueOf(n).substring(1,3);

		}
		result[0] = Integer.parseInt(tmpStringA);
		result[1] = Integer.parseInt(tmpStringB);
		System.out.println(result[0] + "\n" + result[1]);
		
		return result;
		
	}
	
}
