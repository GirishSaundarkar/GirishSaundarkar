package Classmethodandvariablecalling;

public class Exception {

		try {
			System.out.println("1");
			System.out.println("2");
			
			System.out.println("3");
			int c=10/0;
					System.out.println("4");
		}
catch(Exception e) {
	System.out.println("7");
	}
}
}
