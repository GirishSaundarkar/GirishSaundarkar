package ReverseString;

public class ReverseString1 {
public static void main (String[] args) {
	
	String str="Geeks", nstr= "";
char ch;

System.out.print("Original word");
System.out.println("Geeks");//Example word

for (int i=0; i<str.length(); i++)
{
	ch= str.charAt(i);// extracts each character
	nstr= ch+nstr;// adds each character in front of the existing string
}
System.out.println("Reverse word:"+ nstr);
}
}
// contributed by tiyasa