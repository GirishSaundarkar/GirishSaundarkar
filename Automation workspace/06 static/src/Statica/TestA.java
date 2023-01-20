package Statica;

public class TestA {

	public static void main(String[] args) {

		A a=new A();
		a.t++;
		a.s++;
		System.out.println(a.t);// 11
		System.out.println(a.s); //21 latest value which is get incremented
		
		A b=null;
		//b.t++;
		b.s++;
		System.out.println(b.s);//22 updates latest value in static 
	}

}
