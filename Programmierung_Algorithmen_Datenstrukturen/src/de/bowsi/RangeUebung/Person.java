package de.bowsi.RangeUebung;

public class Person {
	int age;
	String name;
	
	final int MIN_AGE = 0;
	final int MAX_AGE = 150;
	
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
		
		if(this.age < MIN_AGE || this.age > MAX_AGE) {
			throw new OutOfRangeException(this.age, MIN_AGE, MAX_AGE);
		}
		
		if(this.name == null || this.name.equals("")) {
			throw new IllegalArgumentException("name parameter should not be null nor empty");
		}
		
		
	}
	
	public String toString() {
		return name + " ist " + age + " alt!";
	}
	

	
}
