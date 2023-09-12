package de.bowsi;

public class Dog {
	private int size;
	private String breed;
	private String name;

	
	public Dog() {
		
	}
	
	public Dog(int size, String breed, String name) {
		this.size = size;
		this.breed = breed;
		this.name = name;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getName() {
		return name;
	}

	
	public void bark() {
			System.out.println("Dog "+ name + " barks: Wau Wau!");

	}
	
	public void eat() {
		System.out.println("Dog " + name + " barks is eating");
	}
	
	public void wagTail() {
		System.out.println("Dog " + name + " wagging its tail");
	}
}
