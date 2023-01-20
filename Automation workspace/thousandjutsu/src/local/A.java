package local;

import java.util.Scanner;

public class A {

	public class swap {
		{
		System.out.println(" Enter the value of x and y");
		Scanner SC = new Scanner(System.in);
		int x = SC.nextInt();
		int y = SC.nextInt();
		System.out.println("before  swapping numbers: "+x + " "+ y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping : "+x + " "+ y);
	}

	}
}
