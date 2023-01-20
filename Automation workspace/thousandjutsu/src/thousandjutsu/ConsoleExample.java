package thousandjutsu;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		
	
	Console cn = System.console();
	int n;
	
	System.out.print("Enter a Number");
	n = Integer.parseInt( cn.readLine() );
	
	System.out.println("The given number :" + n);
     
	 }
}