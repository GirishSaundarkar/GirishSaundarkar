
 class A_l {
void message() {
System.out.println("we are in Class A_l");
}
 }
 class B_l extends A_l{
	 void message(){
	System.out.println("we are in class ");
	}
 
 public class main{
	 public static void main(String[] args) {
 A_l obj1=new A_l();
 B_l obj2=new B_l();
 obj1.message();
	 }
 }
 }