
public class Teststudent {

	public static void main(String[] args) {
		
	student s1=new student();
	s1.accept(101, "raj", 87.5f);
	
	student s2=new student();
	s2.accept(102, "ankit", 80.5f);
	
	if(s1.per>s2.per) {
		System.out.println("student s1 is having higher percent than s2");
	}
	else {
			System.out.println("student s2 is having higher percentage than s1");
		}
	
	}
}
