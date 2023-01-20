package jbk.demo.list;

import java.util.ArrayList;

public class Compare2Arraylist {

	public static void main(String[] args) {

		ArrayList<String> c1=new ArrayList<String>();
		c1.add("red");
		c1.add("green");
		c1.add("black");
		c1.add("white");
		c1.add("pink");
		
		ArrayList<String> c2=new ArrayList<String>();
		c2.add("red");
		c2.add("green");
		c2.add("black");
		c2.add("pink");
		
		ArrayList<String> c3=new ArrayList<String>();
		for(String e: c1) {
			c3.add(c2.contains(e) ? "Yes" : "No");
			System.out.println(c3);
		}
	}

}
