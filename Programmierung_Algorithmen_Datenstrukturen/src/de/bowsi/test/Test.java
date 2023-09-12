package de.bowsi.test;

public class Test {

	public static void main(String[] args) {
		System.out.println("Student");
		Student studiosus = new Student();
		
		Person2 p2 = new Person2("Rainer", "Brang");
		p2.print();
		
		Student2 s2 = new Student2("Karl", "Klug", 554212);
		
		System.out.println("\nAusgabe des Studenten: ");
		s2.print();
		
		
		System.out.println(27 + (27+"27"));
		
		
		/*
		studiosus.setNachname("Maier");
		studiosus.setVorname("Fritz");
		studiosus.setMatrikelnummer(56123);
		studiosus.print();
		studiosus.printMatrikelnummer();
		
		System.out.println("Person");
		Person pers = new Person();
		pers.setNachname("Müller");
		pers.setVorname("Peter");
		
		pers.print();
		*/

		

		
		
	}

}
