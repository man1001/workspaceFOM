package marktplatz;

import java.io.File;
import java.security.MessageDigest;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;


public class Hauptmethode {
	
	// Aufruf main-Methode
	public static void main(String[] args) {
		
		/* Variablendeklaration */
	
		 boolean run;
		 short choice;
		 int sBaujahr;
		 int sKmstand;
		 int sPreis; 
		 String sFarbe;
		 String sMarke;
		 String sTyp;
		 String filePathString;
		 String sSuche;		 
		 ArrayList<Pkw> pkwList;
		 
		 /* Variableninitialisierung*/
		 
		filePathString = "./pkw_data";
		run = true;
		choice = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		/* ArrayList erzeugen */
		File f = new File(filePathString);
		if(f.exists() && !f.isDirectory()) { 
			pkwList = Pkw.loadData();
		}
		else{
			pkwList = new ArrayList<Pkw>();
		}
		
		
		
		/* Menüsteuerung */
		while(run) {
			System.out.println("Hauptmenue:");
			System.out.println("-----------");
			
			System.out.println("0  - Auto erfassen");
			System.out.println("1  - Autoliste");
			System.out.println("2  - Suche einer bestimmten Marke");		
			System.out.println("9  - ENDE");
			System.out.println("10 - simple save");
			System.out.println("11 - simple load\n");
			
			System.out.println("Ihre Wahl: ");
			
			choice = scan.nextShort();
			
			switch (choice) {
			case 0:
				System.out.println("Bitte die Marke eingeben: ");
				sMarke = scan.next();
				
				System.out.println("Bitte das Model eingeben: ");
				sTyp = scan.next();
				
				System.out.println("Bitte das Baujahr angeben: ");
				sBaujahr = scan.nextInt();
				
				System.out.println("Bitte den Kilometerstand angeben: ");
				sKmstand = scan.nextInt();
				
				System.out.println("Bitte die Farbe angeben: ");
				sFarbe = scan.next();
				
				System.out.println("Bitte den Preis angeben: ");
				sPreis = scan.nextInt();
				
				Pkw pkw = new Pkw(sMarke, sTyp, sBaujahr, sKmstand, sFarbe, sPreis);
				pkwList.add(pkw);	
				break;
				
			case 1:
				System.out.println("\nBestandsliste:");
				System.out.println("--------------");
				System.out.println("ID      Marke      Typ       Baujahr       Kilometerstand[km] Farbe       Preis[€]");
				for(int i = 0; i < pkwList.size(); i++) {
					System.out.printf(
							"\n%-6d  %-10s %-10s    %4d    %6d                %-10s %-6d\n", pkwList.get(i).getId(), pkwList.get(i).getMarke(), pkwList.get(i).getTyp(), pkwList.get(i).getBaujahr(), pkwList.get(i).getKmStand(), pkwList.get(i).getFarbe(), pkwList.get(i).getPreis());
				}
				break;
				
			case 2:
				System.out.println("Bitte die zu suchende Marke angeben: ");
				sSuche = scan.next();
				boolean showHeader = true;
				
				System.out.println("Suchergebnis: ");
				System.out.println("-------------\n");
				System.out.println("ID      Marke      Typ       Baujahr       Kilometerstand[km] Farbe       Preis[€]");
				for(int i = 0; i < pkwList.size(); i++) {
					if(sSuche.equalsIgnoreCase(pkwList.get(i).getMarke())) {
						System.out.printf(
								"\n%-6d  %-10s %-10s    %4d    %6d                %-10s %-6d\n", pkwList.get(i).getId(), pkwList.get(i).getMarke(), pkwList.get(i).getTyp(), pkwList.get(i).getBaujahr(), pkwList.get(i).getKmStand(), pkwList.get(i).getFarbe(), pkwList.get(i).getPreis());
					
					}
				}
				
				break;
				
			case 8:
				Pkw pkw8 = new Pkw("BMW", "X3", 1990, 10, "braun", 10000);
				pkwList.add(pkw8);
				break;
				
			case 9:
				run = false;
				Pkw.saveDate(pkwList, filePathString);
				System.out.println("Goodbye!");
				break;
			
			case 10:
				Pkw.saveDataSimple(pkwList);
				break;
				
			case 11:
				pkwList = Pkw.loadDataSimple();
				break;

			}
		}

	}

}
