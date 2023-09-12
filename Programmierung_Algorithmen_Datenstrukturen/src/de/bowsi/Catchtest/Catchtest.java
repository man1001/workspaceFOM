package de.bowsi.Catchtest;

public class Catchtest {
	public void testMethod() {
		try {
			throw new MyException();
		}
		catch(MyException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}

	}
	
	public static void main(String[] args) {
		
		Catchtest x = new Catchtest();
		x.testMethod();
	}

}
