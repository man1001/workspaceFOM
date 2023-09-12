package TestSubstring;

public class Main {
	public static void main(String[] args) {
        String buchtitel = " Java als erste Programmiersprache";
        String buchtitelAnfang;
        System.out.println ("'" + buchtitel + "'");
        System.out.println ("Anzahl der Zeichen des Buchtitels: " + buchtitel.length());


         // Zuweisung eines Teilstrings an buchtitelAnfang
         buchtitelAnfang = buchtitel.substring (0, 7);
         System.out.println ("Der Buchtitelanfang lautet: " + "'" + buchtitelAnfang +"'");
         System.out.println ("Anzahl der Zeichen des Buchtitelanfangs vor trim(): " + buchtitelAnfang.length());

        buchtitelAnfang = buchtitelAnfang.trim();
        System.out.println("Anzahl der Zeichen des Buchtitelanfangs nach trim(): " + buchtitelAnfang.length());

        if(buchtitelAnfang.equals("Java"))
            System.out.println("Buchtitel faengt mit" + "'" + buchtitelAnfang + "'" + "an");
    }
}
