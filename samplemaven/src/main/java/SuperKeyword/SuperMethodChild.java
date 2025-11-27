package SuperKeyword;

public class SuperMethodChild  extends SuperMethodParent {

	public void print()
	{
		
		System.out.println("This is Super Class");
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj = new SuperMethodChild();
		obj.print();
		
	}

}
