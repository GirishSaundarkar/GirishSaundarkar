package inheritance;

public class Employee extends person {

	int empid;
	double salary;
	public Employee(int age, String name, int empid, double salary) { 
super(age, name); 
this.empid = empid;
this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
