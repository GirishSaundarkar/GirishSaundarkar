package Arrayba;

import java.util.Scanner;

public class three_d {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int a= sc.nextInt();
		System.out.println(a*a*a);
		
		System.out.println("Enter the float number:");
		
		float f = sc.nextFloat();
		System.out.println(3.14*f);
		
		System.out.println("Enter the string value:");
		String s=sc.next();
		System.out.println(s +" "+ "loves_girish");
		
		System.out.println("Enter the Character value ");
		char c=sc.next();
	}

}
