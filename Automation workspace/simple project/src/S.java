import java.util.Scanner;

import C.scanner;

public class S {

	public static void main(String[] args) {
		
		int num1,num2,sum;
		
		Scanner sc=new scanner(System.in);
		System.out.println("enter the number");
		num1=sc.nextInt();
		
		System.out.println("enter the second number");
		num2=sc.nextInt();
		
		sc.close();
		sum=num1+num2;
		System.out.println("addition of two numbers is "+sum);
	}

}
