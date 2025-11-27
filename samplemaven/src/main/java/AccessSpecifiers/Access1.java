package AccessSpecifiers;

public class Access1 {
	public void display1()
	{
		System.out.println("Public");
	}
private void display2()
{
System.out.println("Private");
}
protected void display3()
{
	System.out.println("protected");
	
}
void display4()
{
	System.out.println("default");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj = new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
