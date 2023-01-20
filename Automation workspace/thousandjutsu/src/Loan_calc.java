import java.util.Scanner;

public class Loan_calc {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int amount = scanner.nextInt();
		
		int months;
		
		for (months = 3; months>0; months--)
		{
			amount = amount * 90/100;
		}
		System.out.println(amount);
	}

}
