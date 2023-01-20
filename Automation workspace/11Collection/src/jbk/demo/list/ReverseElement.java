package jbk.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {

	public static void main(String[] args) {

		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("green");
		list_String.add("orange");
		list_String.add("white");
		list_String.add("black");
		System.out.println("List before string:/n"+list_String);
		Collections.reverse(list_String);
		System.out.println("list after string:/n"+list_String);
		
	}

}	
