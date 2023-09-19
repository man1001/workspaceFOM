package de.bowsi.IOUebung;

import java.io.*;
import java.util.*;

public class ObjekteLesen {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Bibliothek b = new Bibliothek();
		
		Person p = new Person("Meier", "München", new Date());
		p.writeToFile();
		//b.printList(b.readBuchObject());
		
		

	}

}