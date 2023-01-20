package New;

import java.util.ArrayList;
import java.util.Collections;

public class Test12 {

	private static final String Collections = null;

	public static void main(String[] args) {

		ArrayList<student> al_stud=new ArrayList<student>();
		
		al_stud.add(new student(1,"rajiv"));
		al_stud.add(new student(22,"raj"));
		al_stud.add(new student(78,"sima"));
		al_stud.add(new student(62,"ravi"));
		al_stud.add(new student(11,"akash"));
		
		Collections.(al_stud);   
		al_stud.forEach(t ->system.out.println(t));
	}

}
