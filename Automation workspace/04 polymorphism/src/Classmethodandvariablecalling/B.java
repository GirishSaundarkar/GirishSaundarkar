package Classmethodandvariablecalling;

public class B {
	
 public static void main(String[] args) {
	int num1,num2;
	try {
		num1=0;
		num2=62/num1;
		System.out.println("try block messege");
	}catch(ArithmeticException e) {
		System.out.println("error:don't divide a number by zero");
}
	System.out.println("i'm out of try-catch block in java");
}	
}
