package inheritance.test;

public class Test_X {

	public static void main(String[] args) {
		//ref parent obj parent
		Y obj=new Y();
		System.out.println(obj.t);//100
        obj.m1();

//ref parent = obj child
	
	X obj2=new Y();
	System.out.println(obj2.t);//100
	obj2.m1();
	}
}

