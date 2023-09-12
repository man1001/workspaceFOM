package de.bowsi.eigeneException;

public class MyClass {
	public static void main(String[] args) {
		try {
			MyException ex = new MyException();
			ex.printStackTrace();
			throw ex;
			
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
