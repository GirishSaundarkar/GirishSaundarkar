package Classmethodandvariablecalling;

public class Exercise {
	int a;
	float b;
	String str;
	public void operation1() {
		a=10;
		b=15.26f;
		str="java";
	}
	
	public void operation2() {
		a=20;
		b=27f;
		str="SELENIUM";
	}
	public void display() {
		System.out.println("integer value is:" +a);
		System.out.println("the float value is:" +b);
		System.out.println("the string value is:" +str);
	}

}
