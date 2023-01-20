package C;

import java.util.ArrayList;

import jdk.internal.misc.FileSystemOption;

public class SimpleTest {

	private static final String S = null;

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		Integer i1=new Integer(5);
		a1.add(i1);
		a1.add(10);
		a1.add(22.33f);
		a1.add("jbk");
		a1.add("pune");
		a1.add(10);
		a1.add(10);
		a1.add(null);
		a1.add(null);
		
		System.out.println("a1.size():-"+a1.size());
		a1.add("jbk");
		a1.add(10);
		System.out.println("a1.size():-"+a1.size());
	
		ArrayList a;
		for(int i=0; i<a.size();i++){
		System.out.println(a.get(i));
		//System.out.println(b1.get(i));
		}
		// type of list obj : List
		for(object t : al) { 
			System.out.println(t);
		}
		System.out.println("using iterator for..");
		iterator itr = al.iterator();
	}
}
