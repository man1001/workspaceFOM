package de.bowsi.Foto;

public class Fotoapparat {
	String marke;
	int megaPixel;
	double displayGroesse;
	Objektiv ob = new Objektiv();
	
	public Fotoapparat(String marke, int megaPixel, double displayGroesse) {
		this.marke = marke;
		this.megaPixel = megaPixel;
		this.displayGroesse = displayGroesse;
	}
	
	public void setObjektiv(int brennweiteMin, int brennweiteMax) {
		ob.setBrennweite(brennweiteMin, brennweiteMax);
	}
	
	public Objektiv getObjektiv() {		
		return ob;
	}
	
	public void macheFoto() {
		System.out.println("klick");
	}
	
	@Override
	public String toString() {
		String s = "Marke " + marke + "\nMegaPixel " + megaPixel + "\nDisplayGroesse " + displayGroesse;
		return s;
	}
	
}
