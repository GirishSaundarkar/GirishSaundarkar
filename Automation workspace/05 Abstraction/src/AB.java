
public class AB { //final class--> cannot have sub class

	final int a=10;//final var--> not change its value
	
	void m1() {  //final method -->does not override
		// a=100;
		
	}
}
class BA extends AB{
	
	void m1() {
}
}