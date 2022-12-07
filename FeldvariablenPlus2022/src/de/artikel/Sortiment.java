package de.artikel;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Sortiment {
	
	// Deklaration
	int n = 0;
	float lw;
	
	String[] bezeichnung = new String[100];
	int[] menge = new int[100];
	float[] preis = new float[100];
	
	
	Scanner scan = new Scanner(System.in);
	
	// Menue aufbauen
	public static void menueAufbau() {
		System.out.println("0 - Neuer Artikel");
		System.out.println("1 - Artikelliste anzeigen (mit Lagerwert)");
		System.out.println("2 - Artikel verkaufen");
		System.out.println("3 - Artikel einkaufen");
		System.out.println("4 - Maximaler Lagerwert");
		System.out.println("5 - Minimaler Lagerwert");
		System.out.println("6 - Lagerwert über alle Artikel");
		System.out.println("7 - Durchschnittspreis über alle Artikel");
		System.out.println("8 - Alle Artikel entfernen");
		System.out.println("9 - ENDE");
		
	}
	
	// Beliebig viele Werte eingeben, max 100 St.
	public void setArtikel() {
		System.out.println("Wie viele Artikel sollen eingegeben werden?");
		int dLauf = scan.nextInt();
		
		if(n < bezeichnung.length) {
			for(int i = 0; i < dLauf; i++ ) {
				System.out.printf("Bitte %d. Artikel-Bezeichnung eingeben:", (n+i)+1);
				bezeichnung[i+n] = scan.next();
				
				System.out.printf("Bitte %d. Artikel-Anzahl eingeben:", (n+i)+1);
				menge[i+n] = scan.nextShort();
				
				System.out.printf("Bitte %d. Artikel-Preis eingeben:", (n+i)+1);
				preis[i+n] = scan.nextFloat();
			}
			n = n + dLauf;
		}

	}
	
	// Wert von n bearbeiten
	public void setN(int zahl) {
		n = zahl;
	}
	
	
	//Verarbeitung
	
	// Lagerwert berechnen
	public void lwRechnung() {
		
		for(int i = 0; i < n; i++) {
			lw = lw + menge[i]*preis[i];
		}
		System.out.printf("Lagerwert:             %5.2f\n", lw);
	}
	
	// Artikel verkaufen
	public void artikelVerkaufen() {
		int ind;
		int zahl;
		boolean artExist = false;
		
		System.out.print("Welcher Artikel soll verkauft werden?");
		do{
			ind = scan.nextInt();
			if(ind < n) {	
				artExist = true;
				System.out.printf("Artikel %s gewählt!\n", bezeichnung[ind]);
			}
		}
		while(!artExist);

		System.out.println("Wie viele Artikel sollen verkauft werden?");
		zahl = scan.nextInt();
		if((menge[ind]-zahl) >=0) {
			menge[ind] = menge[ind] -zahl;
		}
		else {
			System.out.print("Maximale Anzahl ueberschritten\n");;
		}
		
	}
	
	// Artikel einkaufen
	public void artikelEinkaufen() {
		int ind = 0;
		int zahl;
		boolean artExist = false;
		boolean arBefuellt = true;
		
		if(n == 0) {
			System.out.println("Keine Artikel vorhanden!");
			arBefuellt = false;
		}
		
		if(arBefuellt) {
			do{
				System.out.println("Welcher Artikel soll nachgekauft werden?");
				ind = scan.nextInt();
				
				if( ind < n && ind >= 0 ) {
					artExist = true;
					System.out.printf("Artikel %s gewählt!\n", bezeichnung[ind]);
				}else {
					System.out.println("Artikel existiert nicht!");
				}
			}
			while(!artExist);
		}
		

		if(arBefuellt && artExist) {
			System.out.println("Wie viele Artikel sollen gekauft werden?");
			zahl = scan.nextInt();
				menge[ind] = menge[ind] + zahl;
		}

		
	}
	
	// Maximalen Lagerwert finden
	public float getLagerwertMax() {
		float max = 0;
		
		for(int i = 0; i < n; i++) {
			if(menge[i]*preis[i]>= max) {
				max = menge[i]*preis[i];
			}
		}
		
		return max;
	}
	
	// Minimalen Lagerwert finden
	public float getLagerwertMin() {
		float min = 0;
		
		for(int i = 0; i < n; i++) {
			if(menge[i]*preis[i]<= min) {
				min = menge[i]*preis[i];
			}
		}
		
		return min;
	}
	
	// Lagewert aller Artikel
	public void getGesamtLagerwert() {
		float lagerGes = 0;
		for(int i = 0; i < n; i++) {
			lagerGes = lagerGes + (menge[i]*preis[i]);
		}
		System.out.println("Lagerwert alle Artikel: " + lagerGes);
	}
	
	// Durchschnittspreis aller Artikel
	public float getDSchnitt() {
		float ges = 0;
		float dSchnitt = 0;
		for(int i = 0; i < n; i++) {
			ges = ges + preis[i];
		}
		dSchnitt = ges/n;
		System.out.printf("Durchschnittlicher Preis aller Artikel: %.2f €\n\n", dSchnitt);
		return dSchnitt;
	}
	
	
	// Ausgabe
	// Ausgabe aller Array werte (bezeichnung,menge,preis)
	
	public void sysoArray() {
		String ueberschrift = "Index     Bezeichnung      Menge     Preis              Wert";
		printHeadline(ueberschrift);
		for(int i = 0; i < n; i++) {
			System.out.printf("%d     %10s          %4d      %7.2f €     %7.2f €\n",i, bezeichnung[i],menge[i],preis[i],(menge[i]*preis[i]));
		}
		printLine(ueberschrift);
		lwRechnung();
	}
	
	public static void printHeadline(String s) {
		String uStrich = "";
		
		System.out.println(s);
		
		for(int i = 0; i < s.length(); i++) {
			uStrich = uStrich + "=";
		}
		
		System.out.println(uStrich + "\n");
		
	}
	
	public static void printLine(String s){
		String uStrich = "";
		
		
		for(int i = 0; i < s.length(); i++) {
			uStrich = uStrich + "-";
		}
		System.out.println(uStrich + "\n");
	}
	
	public void writeData() {
		FileWriter fw;
		BufferedWriter bw;
		try {
			 fw = new FileWriter("Artikel.txt");
			 bw = new BufferedWriter(fw);
			 
			 bw.write(n+"\n");
				for(int i = 0; i < n; i++) {
					bw.write(bezeichnung[i]+ "\n");
					bw.write(menge[i]+ "\n");
					bw.write(preis[i]+"\n");
				}
				
				bw.close();
				fw.close();
		}
		catch(Exception e){
			System.out.println("Bad Things Happend!");
		}
		
	}
	
	public void readData() {
		
		try {
			FileReader fr = new FileReader("Artikel.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String tmpString = br.readLine();
			String tmpMeString;
			String tmpPrString;
			
			n = Integer.parseInt(tmpString);
			for(int i = 0; i < n; i++) {
				bezeichnung[i] = br.readLine();
				tmpMeString = br.readLine();
				menge[i] = Integer.parseInt(tmpMeString);
				tmpPrString = br.readLine();
				preis[i] = Float.parseFloat(tmpPrString);
			}
			br.close();
			fr.close();
			
		} catch(Exception e) {
			System.out.println("Some really bad things happend!");
		}
	}
}
