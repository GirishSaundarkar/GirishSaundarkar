package thousandjutsu;

public class Factorial {
public static void main(String[] args) {
	

	int num = 3; //3! = 3*2*1
	long factorial = 1;
	for(int i = 1; i <= num; ++i)
	{
		factorial *= i;
	}
	System.out.printf("Factorial of %d = %d",num, factorial);
}
}
