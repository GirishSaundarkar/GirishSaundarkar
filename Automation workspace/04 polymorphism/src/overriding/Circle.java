package overriding;

public class Circle extends shape {
	void calArea() {
	int r=10;
	float area = 3.14f *r*r;
	System.out.println("Area of the circle is.." +area);
}
}