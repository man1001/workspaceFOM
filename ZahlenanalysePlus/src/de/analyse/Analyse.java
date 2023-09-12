package de.analyse;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Analyse {
	
	Scanner scan = new Scanner(System.in);
	
	String s = new String("Hallo");
	
	// Methode zum aufbauen des Menues
	public static void menueAufbauen() {
		System.out.println("0 - Neue Zahl");
		System.out.println("1 - Alle Zahlen anzeigen");
		System.out.println("2 - Summe bilden");
		System.out.println("3 - Maximum suchen");
		System.out.println("4 - Minimum suchen");
		System.out.println("5 - Durchschnitt berechnen");
		System.out.println("6 - Sortieren (aufsteigend)");
		System.out.println("7 - Sortieren (absteigend)");
		System.out.println("8 - Alle Zahlen entfernen");
		System.out.println("9 - ENDE");
		System.out.println("10 - Array mit Zufallszahlen befuellen");
		System.out.println("Ihre Wahl? ");
	}
	
	// Methode zur Ausgabe der Ueberschrift
	public static void printHeadline(String s) {
		String uStrich = "";
		
		System.out.println(s);
		
		for(int i = 0; i < s.length(); i++) {
			uStrich = uStrich + "=";
		}
		
		System.out.println(uStrich + "\n");
		
	}
	
	// Methode fuer Trennlinie
	public static void printTrenner() {
		System.out.println("==========================");
	}
	
	// Methode zum berechnen der Summe
	public static int summeBerechnen(int[] array, int n){
		int sum = 0;
		for(int i = 0; i< n; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	// Methode zum einlesen einer neuen Zahl in das Array
	public int zahlEinlesen(int[] array, int n) throws IOException {
		if(n < array.length) {
			System.out.print("Neue Zahl (Position " + (n+1) +"): ");
			try {
				array[n] = scan.nextInt();
			} catch(Exception e){
				printHeadline("Fehlerhafte Eingabe");
				scan.next();
			}
			
			n++;
			saveData(n, array);
		}
		else if(n >= array.length) {
			System.out.println("Fehler: Grenze des Arrays erreicht!");
		}
		
		return n;
	}
	
	// Methode zur Ausgabe aller Zahlen im Array
	public static void getArray(int[] array, int n) {
		if(n==0) {
			printHeadline("Keine Zahlen vorhanden!");
		}
		else {
			printHeadline("Ausgabe aller Zahlen im Array");
			for(int j=0; j<n; j++) {
				
				if (j != 0 && j%5 ==0) {
					System.out.print("\n");
				}
				
				if(j < n -1) {
					System.out.printf("%3d - ", array[j]);
				}
	
				else if (j == n -1) {
					System.out.printf("%3d\n", array[j]);
				}
			}
			System.out.println("\n");
		}
	}
	
	// Methode zum Suchen des Maximums
	public static int getMax(int[] array, int n) {
		int max = 0;
		if(n == 0) {
			printHeadline("Keine Zahlen vorhanden!");
		}
		else {
			for(int i = 0; i < n; i++) {	
				if(array[i] >= max) {
					max = array[i];
				}
			}
		System.out.println("Maximum: "+ max);
		}
		return max;
	}
	
	// Methode zum Suchen des Minimums
	public static int getMin(int[] array, int n) {
		int min = 0;
		if(n == 0) {
			printHeadline("Keine Zahlen vorhanden!");
		}
		else {
			for(int i = 0; i < n; i++) {	
				if(array[i] <= min) {
					min = array[i];
				}
			}
		System.out.println("Minimum: "+ min);
		}
		return min;
	}
	
	// Methode zur Berechnung des Durchschnitts
	
	public void getDurchschnitt(int[] array, int n) {
		double dSchnitt = (double)(summeBerechnen(array, n))/n;
		System.out.printf("Durchschnitt: %.2f\n\n", dSchnitt);
	}
	
	// Bubble-Sort Algorithmus ausfwaerts
	public void sortUp(int[] array, int n) throws IOException {
		
		boolean sortiert = false;
		if (n == 0) {
			System.out.println("Keine Zahl vorhanden!");
		}
		else {
			printHeadline("Sortierung aufsteigend");
			int tausch = 0;
			do {
				sortiert = true;
					for (int i = 0; i < n - 1; i++ ) {
						if(array[i]> array[i+1]) {
							tausch = array[i];
							array[i] = array[i+1];
							array[i+1] = tausch;
							sortiert = false;
						}
					}
			} while (sortiert == false);
			
		}
		System.out.println("Zahlen wurden sortiert!");
		saveData(n, array);
	}
	
	// Bubble-Sort Algorithmus abwaerts
	public void sortDown(int[] array, int n) throws IOException {
			
			boolean sortiert = false;
			if (n == 0) {
				System.out.println("Keine Zahl vorhanden!");
			}
			else {
				printHeadline("Sortierung absteigend");
				int tausch = 0;
				do {
					sortiert = true;
						for (int i = 0; i < n - 1; i++ ) {
							if(array[i] < array[i+1]) {
								tausch = array[i];
								array[i] = array[i+1];
								array[i+1] = tausch;
								sortiert = false;
							}
						}
				} while (sortiert == false);
				
			}
			System.out.println("Zahlen wurden sortiert!");
			saveData(n, array);
		}
	
	// Array mit Random Zahlen befuellen
				
	public static int addRandom(int n, int[] array) throws IOException {
					Random rnd = new Random();
					for(int i = n; i < array.length; i++) {
						array[i] = rnd.nextInt(100);
					}
					n = 100;
					System.out.println("Array befuellt!");
					saveData(n, array);
					return n;
				}
	
	// Speichern aller Zahlen
	public static void saveData(int n, int[] array) throws IOException {
		FileWriter fw = new FileWriter("Artikel.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(n + "\n");
		
		for(int i = 0; i < array.length; i++) {
			bw.write(array[i] + "\n");
		}
		
		bw.close();
		fw.close();
		printHeadline("Daten gespeichert!");
	}
	
	// Lesen aller Zahlen
	public static int readData(int[] array) throws IOException  {
		FileReader fr = new FileReader("Artikel.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String tmpString=br.readLine();
		int n=Integer.parseInt(tmpString);
		System.out.println("N:" + n);
		
		for(int i = 0; i < n; i++) {
			tmpString = br.readLine();
			array[i] = Integer.parseInt(tmpString);
		}
		
		br.close();
		fr.close();
		printHeadline("Daten erfolgreich gelesen!");
		return n;
	}
	
	
}