package Overloading;

public class Testshape {

	public static void main(String[] args) {

		shape obj1=new shape();
		obj1.calArea(10); //circle
		
		obj1.calArea(10,6.0f);  //rectangle
		
		obj1.calArea(10.5f); //square
		
		obj1.calArea(10,6); //rectangle
	}

}
