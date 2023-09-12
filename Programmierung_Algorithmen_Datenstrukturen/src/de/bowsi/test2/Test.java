package de.bowsi.test2;

public class Test {
	boolean b = true;
	public void testWhile() {
		int count = 0;
		while(b) {
			System.out.println("ahoi");
			System.out.println(count);
			count ++;
			if(count >= 10) {
				b = false;
			}
		}
	}
}
