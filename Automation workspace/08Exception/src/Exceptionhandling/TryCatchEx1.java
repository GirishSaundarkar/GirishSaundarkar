package Exceptionhandling;

public class TryCatchEx1 {

	public static void main(String[] args) {

		int num1,num2;
		try {
			num1=0;
			num2=62/num1;
			System.out.println("Try block message");
		}catch(ArithmeticException e) {
			System.out.println("Error:don't divide a number by zero");
		}
		System.out.println("i'm out of try-catch block in java.");
		}
	}