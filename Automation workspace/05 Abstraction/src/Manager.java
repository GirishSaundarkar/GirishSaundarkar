
public abstract class Manager {
	
	void doLogin() {}
	
	void assignTask() {}
	
	void writecode() {} //abstract method
	
}

class Employee extends Manager{

	@Override
	void writecode() {
		
	}
}

