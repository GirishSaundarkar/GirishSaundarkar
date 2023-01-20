package C;

import java.nio.channels.AlreadyBoundException;

public class A {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("first print statement in try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("warning:ArithematicException");
		
		}catch(ArrayBoundException e)
		{
			
			System.out.println("warning: ArrayIndexOutOfBolundsException");
			
		}catch(Exception e) {
			System.out.println("warning:some Other exception");
		}
	System.out.println("out of try-catch block...");	
	}
}