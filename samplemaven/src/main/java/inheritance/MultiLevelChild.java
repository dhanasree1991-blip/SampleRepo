package inheritance;

public class MultiLevelChild extends MultiLevelParent {

	public void dispaly()
	{
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild obj= new MultiLevelChild();
		obj.Print();
		obj.show();
		obj.dispaly();
	}
}

