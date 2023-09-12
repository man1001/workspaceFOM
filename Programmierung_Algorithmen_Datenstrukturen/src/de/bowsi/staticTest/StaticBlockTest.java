package de.bowsi.staticTest;

public class StaticBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlock object1 = new StaticBlock();
		StaticBlock.anzahl++;
		
		System.out.println("Anzahl erzeugter Objekte: " + StaticBlock.anzahl);
		
		System.out.println("Aufrufe stat. Initialisierunsblock: " + StaticBlock.anzahlAufrufeStaticBlock);
		
		StaticBlock object2 = new StaticBlock();
		StaticBlock.anzahl++;
		
		System.out.println("Anzahl erzeugter Objekte: " + StaticBlock.anzahl);
		
		System.out.println("Aufrufe stat. Initialisierunsblock: " + StaticBlock.anzahlAufrufeStaticBlock);
	}

}
