package local;

import java.util.Scanner;

public class programtoconvertdatetosecondsorviceversa {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int days = scanner.nextInt();
			
			//your code goes here
			days =days*24*60*60;
			System.out.println(days);
}
}