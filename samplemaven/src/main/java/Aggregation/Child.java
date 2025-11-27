package Aggregation;

public class Child {

	
	String city;
	String state;
	Parent ref;
	public Child(String city,String state,Parent ref)
	{
		this.city = city;
		this.state=state;		
		this.ref=ref;
	}
	public void display ()
	{
		System.out.println("Name : "+ ref.name );
		System.out.println("Rollno : "+ ref.rollno );
		System.out.println("Address : "+ ref.address );		
		System.out.println("City : "+ city );
		System.out.println("State : "+ state );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent obj = new Parent("Ivani",20,"Jamieson PKY");
Child obj1 =new Child ("Cambridge","Ontario",obj);
obj1.display();
	}

}
