package Arrayba;

import java.util.Scanner;

public class dynamic_array {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("enter the array elemnts");
		for(int i=0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("printing array elements");
		for(int i=0 ; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
