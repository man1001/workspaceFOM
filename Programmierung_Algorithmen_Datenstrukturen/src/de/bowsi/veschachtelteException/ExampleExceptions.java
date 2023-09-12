package de.bowsi.veschachtelteException;

public class ExampleExceptions {

	public static void main(String[] args) {

		try
		{
			try
			{
				int[] a = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException excpt)
			{
				System.out.println("My Message: Index is out of range");
				System.out.println("The System\'s message: " + excpt.getMessage());
			}
			
			finally {
				System.out.println("Finally out of Range Block\n");
			}
			
			try
			{
				int x = 20/0;
			}
			catch (ArithmeticException ae) {
				System.out.println("MyMessage: Nicht durch null dividieren!");
				System.out.println("The System\'s message: " + ae.getMessage());
			}
			finally
			{
				System.out.println("Finally out of divides by zero block\n");
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		finally
		{
			System.out.println("Finally out of exception Block\n");
		}
		
		System.out.println("Everything complete!");
	}

}
