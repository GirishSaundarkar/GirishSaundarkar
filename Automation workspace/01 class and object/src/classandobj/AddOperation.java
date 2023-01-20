package classandobj;

public class AddOperation {
	int add_in(int x,int y) {
		return x+y;
		
	}

	public static void main(String[] args) {
		AddOperation addOperation=new AddOperation();
		int z=addOperation.add_in(2,4);
		System.out.println(z);

	}

}
