package Exceptionhandling;

public class A {

	private static String s;

	public static void main(String[] args) {
		
		String[] cities= {"pune","nasik","mumbai","nagpur","delhi"};
		int check = 0;
		for (int i = 0; i < s.length(); i++) {
		for (int j = 0; j < s.length(); j++) {
		if (s.charAt(i) == s.charAt(j) && i != j) {
		check = 1;
		break;
		}
		}
		}
		if (check == 1) {
		System.out.println("String does not have all unique character");
		} else {
		System.out.println("String have all unique character");
		}
	}
	}
