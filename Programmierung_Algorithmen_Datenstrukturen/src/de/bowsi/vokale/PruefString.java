package de.bowsi.vokale;

public class PruefString {
	String testString;
	String testStringLowerCaste;
	String vocalMap = "";
	
	public PruefString(String s) {
		testString = s;
		testStringLowerCaste = s.toLowerCase();
		testVokal();
	}
	
	private void testVokal() {
		for(int i = 0; i < testStringLowerCaste.length(); i++) {
			if(
				testStringLowerCaste.charAt(i) == 'a' ||  
				testStringLowerCaste.charAt(i) == 'e' ||
				testStringLowerCaste.charAt(i) == 'i' ||
				testStringLowerCaste.charAt(i) == 'o' ||
				testStringLowerCaste.charAt(i) == 'u' 
			) {
				vocalMap += "-";
			}else
			{
				vocalMap += ".";
			}
		}
	}
	
	public String getVocalMap() {
		return vocalMap;
	}
	
	public String getTestString() {
		return testString;
	}
	
	
}
