package enc.bowsi.de;

public class Helfer {
	

	
	public String encryptChar(String w, String a, String c) {
		String result = "";
		
		for(int i = 0; i < w.length(); i++) {
			for(int j = 0; j < a.length(); j++) {
				if(Character.toUpperCase(w.charAt(i)) == a.charAt(j)) {
					result = result + c.charAt(j);
					break;
				}
			}
		}
		
		return result;
	}
}
