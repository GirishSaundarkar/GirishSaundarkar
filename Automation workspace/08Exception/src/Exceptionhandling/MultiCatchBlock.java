package Exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
try {
	int a[]=new int[7];
	a[4]=30/0;
	System.out.println("First print statement in try block");
}catch(ArithmeticException e) {
	System.out.println("warning: ArithmeticException");
}catch(ArrayIndexOutOfBoundsException e) {
	
	System.out.println("warning:ArrayIndexOutofboundException");

}catch(Exception e) {
	System.out.println("warning: some Other exception");
}
System.out.println("Out of try catach block...");
}
	}

