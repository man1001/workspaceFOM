package de.bowsi.parseInt;

public class Parser {
	
	public Parser() {
		
	}

	public int parseInt(String var) {
		return Integer.parseInt(var);
	}
	
	public int parseInt(String var, int pos) {
		var = var.substring(pos);
		return Integer.parseInt(var);
	}
	
	public int parseInt(String var, int von, int laenge) {
		var = var.substring(von, laenge);
		return Integer.parseInt(var);
	}
	
}
