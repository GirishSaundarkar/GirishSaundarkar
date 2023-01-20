package multithread1;

public class Test2 {

	public static void main(String[] args) {

		Account a1 = new Account();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		
		t1.start();
		t2.start();
	}

}
