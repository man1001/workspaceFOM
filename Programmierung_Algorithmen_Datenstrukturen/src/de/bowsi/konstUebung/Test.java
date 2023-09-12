package de.bowsi.konstUebung;

public class Test {
	
	int a, b;
	
	public Test(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("a is " + a +"\nb is " + b);
	}
	
	public boolean equalto(Test o) {
		
		if(o.a == a && o.b == b) {
			return true;
		}else {
			return false;
		}
	}
	
}
