package C;

public class scanner {
	
	public static void main(String[] args) {
		
		int n=1234;// 4321+1=4321
		int rev=0;
		    while(n>0) {
			int rem=n%10;
			n= n/ 10;
			rev=(rev*10)+rem;
		    }
		    
			System.out.print(rev);
			System.out.println(rev+1000);
		}
		
}
}