package multithread1;

public class Account implements Runnable{
int accno=1010202010;
double balance =1000;
final double MIN_BAL=500;
	@Override
	public void run() {
      for(int i=1; i<=5; i++)
      withdraw(200);
	}

	void withdraw(int amt) {
		if(balance - amt>=MIN_BAL) {
		balance= balance - amt;
		System.out.println("widrawal done..balance is..");
	}else{
System.out.println("invalid transaction");
}
	}
}