package jbk.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleTest {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10); //integer   int
		Integer i1=new Integer(10);
		al.add(i1);
		al.add(10);
		al.add(22.33f);
		al.add("jbk");
		al.add(10);
		al.add(10);
		al.add(null);
		al.add(null);
		al.remove(10);
		
		System.out.println("al.size() :- "+al.size());
		al.add("jbk");
		al.add(10);
		System.out.println("after update al.size() :-" + al.size());

		for(int i= 0; i< al.size(); i++) {
			// system.out.println(al.get(i));
		}
		System.out.println("using enhance for..");
		// type_ofList obj : List
		for (Object t : al) {
			System.out.println(t);
		}
		System.out.println("using Iterator for..");
Iterator itr= al.iterator();
//Iterator - access the data or elements from collection
// next();
//hasnext();
while(itr.hasNext()) {
System.out.println(itr.next());	
}
ListIterator listitr= al.listIterator();
	}
}
