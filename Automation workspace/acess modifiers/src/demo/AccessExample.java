package demo;

public class AccessExample {

	public static void main(String[] args) {
		private int x = 56;
		public void showDemo() {
		System.out.println("The Variable value is " + x);
		}
		private void testDemo() {
		System.out.println("It cannot be accessed in another class");


	}

}
