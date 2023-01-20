package jbk.demo.list;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		         // Print the linked list
		  for (String element : l_list) {
		    System.out.println(element);
}
}
}
