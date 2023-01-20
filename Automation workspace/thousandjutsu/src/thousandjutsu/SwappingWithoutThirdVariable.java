package thousandjutsu;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		int a, b;
		
		a = 10;
		b = 20;
		System.out.println("\nBefore Swapping : ");
		System.out.println( a + "  " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\nAfter Swapping : ");
		System.out.println(a + "  " + b);
	}

}
