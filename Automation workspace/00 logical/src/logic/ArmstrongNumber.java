package logic;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 370, number, temp, total = 0;
		 number= num;
		 while (number != 0)
		 {
			 temp = number % 10;// modular division
			 total = total + temp*temp*temp;
			 number /= 10;
		 }
		 
			
	if(total == num)
			 System.out.println(num + "is an armstrong number");
		 else 
			 System.out.println(num + "is not an armstrong number");
	}

}
