package probek.bowsi.de;

public class Email {
	public static void main(String[] args) {
		
		System.out.println(Email.eMail("maria","heilig"));
		
		pkw p = new pkw();
		p.fahren(100);
		System.out.println(p.get_tankInhalt());
	}
	
	
	public static String eMail(String vorname, String nachname) {
		String result = "";
		
		for(int i = 0; i < 3; i++) {
			result = result + vorname.charAt(i);
		}
		
		result = result + "." + nachname + "@muenchen.de";
		
		return result;
	
	}
	

}
