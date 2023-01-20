package Controlstatement;

public class Nestedif {

	public static void main(String[] args) {
		int x=10;
		int y=11;
		if(x==10) {
			if(y==10) {
				System.out.println("both variables are equal");
			}else {
				System.out.println("both are not equal");
			}
		}

	}

}
