package thousandjutsu;

public class as {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - you must be at least 18 years old.");
		}
		else {
			System.out.println("Acess granted - you are old enough!");
			
		}
	}
public static void main(String[] args) {
	checkAge(15);
}
}
