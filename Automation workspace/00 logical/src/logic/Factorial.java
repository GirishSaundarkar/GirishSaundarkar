package logic;

public class Factorial {

	public static void main(String[] args) {

		// factorial n=5 ---5*4*3*2*1
		
		int n=5, fact=1;
		for(int i=1; i<=5; i++){
		fact=fact*i;
		System.out.println("the factorial is"+fact);
		}
		
	}

}
