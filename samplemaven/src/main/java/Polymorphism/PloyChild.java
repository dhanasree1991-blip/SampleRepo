package Polymorphism;

public class PloyChild extends PolyParent {
	public void display (int a,	int b)
	{
		super.display(10, 20);
	int c =a-b;
	System.out.println("c : "+ c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PloyChild obj = new PloyChild();
		obj.display(40, 20);
	}

}
