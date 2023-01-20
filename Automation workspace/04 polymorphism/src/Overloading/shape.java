package Overloading;

public class shape {
	
void calArea(int r) {
	float res=3.14f *r*r;
	System.out.println("Area of circle is..."+res);
}
void calArea(int b,float l ) {
	float res=0.5f *b*l ;
	System.out.println("Area of rectangle is.."+res);
}
void calArea(float r) {
	float res=3.14f *r*r;
	System.out.println("Area of square is.."+res);
}
	
	void calArea(int b,int l) {
		float res=0.5f *b*l ;
		System.out.println("Area of Rectangle is..."+res);
	}
}
