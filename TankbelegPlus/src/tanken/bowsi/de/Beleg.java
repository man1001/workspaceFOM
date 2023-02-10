package tanken.bowsi.de;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;


public class Beleg {

	/* Globale statische Variable zum hochzaehlen der id */
	static int sid = 1;
	static int kmAnfangsStand = 0;
	/* Pfad zum Textfile in dem die Daten der Belege gespeichert werden */
	static String path = "./saveData.txt";
	
	/* Variablen deklaration */
	int id;
	String datum;
	float liter;
	int kmStand;
	float preisProLiter;

	
	/* Standard Konstruktor */
	public Beleg(String d, float l, int kms, float ppl) {
		datum = d;
		liter = l;
		kmStand = kms;
		preisProLiter = ppl;
		id = sid;
		sid++;
	}
	
	/* Konstruktor der die Uebergabe eines Integers für die ID ermoeglicht */
	public Beleg(int i, String d, float l, int kms, float ppl) {
		datum = d;
		liter = l;
		kmStand = kms;
		preisProLiter = ppl;
		
		/* Uebergabe i als id und hochzaehlen der statischen id Variable (sid) */
		id = i;
		sid = id + 1;
	}
	

	
	/* Setter-Methoden */
	public static void setKmAnfangsStand(int betrag) {
		kmAnfangsStand = betrag;
	}
	
	/* Getter Methoden */
	public String getDatum() {
		return datum;
	}
	
	public float getLiter() {
		return liter;
	}
	
	public int getKmStand() {
		return kmStand;
	}
	
	public float getPreisProLiter() {
		return preisProLiter;
	}
	
	public int getID() {
		return id;
	}
	
	public static void saveDate(ArrayList<Beleg> al) {

	
		try {


			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(Integer.toString(al.size())+"\n");
			for(int i = 0; i < al.size(); i++) {
				
				bw.write(Integer.toString(al.get(i).getID())+"\n");
				bw.write(al.get(i).getDatum()+"\n");
				bw.write(Float.toString(al.get(i).getLiter())+"\n");
				bw.write(Integer.toString(al.get(i).getKmStand())+"\n");
				bw.write(Float.toString(al.get(i).getPreisProLiter())+"\n");
			}
			bw.close();
			fw.close();
			System.out.println(" [!]Info: Daten erfolgreich gespeichet");
			
		} catch (Exception e) {
			/*
			 Wird ausgeführt wenn es innerhalb des Try-Blocks zu einer Exception kommt
			
			 TODO In der gegenwärtigen Form wird kein "Resource leak" abgefangen,
			 dies sollte in einer spaeteren Version hinzugefuegt werden
			*/
			System.out.println(" [!]Warnung: Fehler beim speichern der Datei\n");
		}
		
	}
	
	/* Methode zum laden der gespeicherten Daten aus der Textdatei */
	public static ArrayList<Beleg> loadData() {
		File f = new File(path);
		
		/* Variable für die Anzahl der gepeicheten Zeilen */
		int n;
		
		/* Temporaere Variablen zum Zwischenspeichern der Daten */
		int tmpId;
		String tmpDate;
		float tmpLiter;
		int tmpKmStand;
		float tmpPreis;
		
		/* Temporaeres ArrayList Objekt welches als Rueckgabewert der Methode dient */
		ArrayList<Beleg> tmpAList = new ArrayList<Beleg>();
		
		/* Wird ausgeführt wenn die Speicher-Datei existiert */
		if(f.exists() && !f.isDirectory()) {
	
			
			try {
				FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				n = Integer.valueOf(br.readLine());
				for(int i = 0; i < n; i++) {
					
					/* Zuweisung Werte aus der Textdatei in temporaere Variablen */
					tmpId = Integer.parseInt(br.readLine());
					tmpDate = br.readLine();
					tmpLiter = Float.parseFloat(br.readLine());
					tmpKmStand = Integer.parseInt(br.readLine());
					tmpPreis = Float.parseFloat(br.readLine());
					
					/* Erstellen eines Beleg Objekts und hinzufuegen zu einer ArrayListe */
					Beleg beleg = new Beleg(tmpId, tmpDate, tmpLiter, tmpKmStand, tmpPreis);
					tmpAList.add(beleg);
				}
				
				br.close();
				
			} catch (Exception e) {
				/*
				Wird ausgeführt wenn es innerhalb des Try-Blocks zu einer Exception kommt
				
				TODO In der gegenwärtigen Form wird kein "Resource leak" abgefangen,
				dies sollte in einer spaeteren Version hinzugefuegt werden
				*/
				System.out.println(" [!]Warnung: Fehler beim lesen der Datei\n");
			}
			System.out.println(" [!]Info: Daten wurden geladen\n");

			
		}
		return tmpAList;
	}
	
	
	
}
