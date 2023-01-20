package inheritance.test;

public class X {

	int t = 10;
	
	void m1() {
		System.out.println("1111");
	}
}

class Y extends X{
	int t= 100;
	
	void m1() {
		System.out.println("2222");
	}
}
