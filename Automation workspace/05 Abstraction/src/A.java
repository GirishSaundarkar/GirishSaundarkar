
public abstract class A {
	
	void m1() { //concreate method
		System.out.println("m1 of A....");
	}
abstract void m2(); // abstract method --> order to sup
}

class B extends A{

	@Override
	void m2() {
		System.out.println("m2 code in B");
	}
	void m3() {
	}
	}
