package thousandjutsu;

public class Swap {

	public static void main(String[] args) {
		int a,b,t;
		
		a=10;
		b=20;
		
		System.out.println("\nBefore Swapping :");
		System.out.println( a + "    " + b);
		
		t = a;
		a = b;
		b = t;
		System.out.println("\nAfter Swapping :");
		System.out.println(a + "  " + b);
	}
}
