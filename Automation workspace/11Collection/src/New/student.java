package New;

public class student implements comparable <student>{
	
	int id;
	String name;
	public student(int id,String name) {
		super();
		this.id=id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "student [id=" + id + ",name" + name + "]";
		
}
	@Override
public int compareTo(student obj) {
	return.name.compareTo(obj.name);
}
}
