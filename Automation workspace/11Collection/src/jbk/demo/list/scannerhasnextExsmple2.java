package jbk.demo.list;

import java.util.Scanner;

public class scannerhasnextExsmple2 {

	public static void main(String[] args) {

		String s = "hello, this is javapoint";
		
		Scanner scan = new Scanner(s);
		System.out.println("result:"+scan.hasNext());
		System.out.println("String:"+scan.nextLine());
		System.out.println("Final Result:"+scan.hasNext());
		scan.close();
	}

}
