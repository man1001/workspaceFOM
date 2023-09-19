package de.bowsi.IOUebung;

import java.util.Date;
import java.util.Objects;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
	private String city;
	private Date birthday;
	
	public Person(String name, String city, Date birthday) {
		Objects.requireNonNull(name, "paramter 'name' must not be null");
		Objects.requireNonNull(city, "paramter 'city' must not be null");
		Objects.requireNonNull(birthday, "paramter 'birthday' must not be null");
		
		this.name = name;
		this.city = city;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public Date getBirthday() {
		return new Date(birthday.getTime());
	}
	
	public String toString() {
		return "Person: " + name + "\nStadt: " + city + "\nGeburtsdatum: " + birthday;
	}
	
	public void writeToFile() throws IOException{
		
		// Hier wird ARM == Automatic Resoure Managment benutzt,
		// um "besser lesbare" Ressourcen-Zugriffe zu schreiben
		// (alle benannt, alle aufgelistet am selben ort nach try)
		// Ist ein Java Sprach-Feature zum automatischen schliessen von Ressouren
		try(ObjectOutputStream objOut = new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream("personenObjekte.ser"))))
		{
			Person person = this;
			objOut.writeObject(person);
			System.out.println("In den Stream geschrieben: " + person);
		}
		

		
		
	}

}
