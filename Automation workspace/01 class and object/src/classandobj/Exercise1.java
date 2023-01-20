package classandobj;

public class Exercise1 {
	int a;
	float b;
	String str;
	
	public void operation1() {
		a=10;
		b=15.26f;//float value should be defined as decimal with f
		str="java";
	}
		
		public void operation2() {
			a=20;
			b=27f;
			str="SELENIUM";
		}
		
public void display() {
	System.out.println("the integer value is:"+a);
	System.out.println("the float value is:"+b);
	System.out.println("The string value is:"+str);
	}
}

