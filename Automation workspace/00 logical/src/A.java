
public class A {

	public static void main(String[] args) {

		for(int i=3; i>=1; i--) //row
		{
			
			for(int j=1 ; j<=i; j++) //column
			{
				System.out.print("* ");
			}
			System.out.println("$");
		}
	}

}
