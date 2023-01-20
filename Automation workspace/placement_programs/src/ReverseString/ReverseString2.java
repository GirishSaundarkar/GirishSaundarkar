package ReverseString;

public class ReverseString2 {

	public static void main(String[] args) {

	String str="Geeks", nstr"";
	char ch;
	System.out.println("original word:");
System.out.println("Geeks");// Example word

for (int i=0; i<str.length(); i++)
{
	ch= str.charAt(i);
	nstr= ch+nstr; // adds character in front of the existing string
}
System.out.println("Reverse word:" + nstr);

}
}

// contributed by Tiyasa
