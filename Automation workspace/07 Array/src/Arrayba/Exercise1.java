package Arrayba;

public class Exercise1 {

	private static final String Arrays = null;

	public static void main(String[] args) {

		int[] my_array1= {
				1789, 2035, 1899, 1456, 2013,
				1458, 2458, 1254, 1472, 2365,
				1456, 2165, 1457, 2456};
		
		String[] my_array = {
				
				"java",
				"python",
				"php",
				"c#"
				"c programming",
				"c++"
		};
		System.out.println("original numeric array : "+Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("sorted numeric array : "+Array.toString(my_array1));
		
		System.out.println("original string array1:"+Array.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("sorted string array : "+Arrays.toString(my_array2));
	}

}
