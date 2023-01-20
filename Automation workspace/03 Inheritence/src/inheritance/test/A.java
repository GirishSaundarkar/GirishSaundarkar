package inheritance.test;

public class A {

	public static void main(String[] args) {

	int  n=1234 , rem, sum=0;
	
	while(n>0) {
		
		rem= n%10;
		n= n /10;
		
		sum=sum+rem;
		
	}
	System.out.println(sum);
	}

}
//debugging