package inheritance;

public class Parent extends GrandParent  {
	
	int i = 50;
	
	public void home()
	{
		System.out.println("Home method from parent class");
	}
	
	public void car()
	{
		System.out.println("Car method from parent class");
		System.out.println(super.i);// it will call the grand parent class variable
	}
	
	public void property()
	{
		System.out.println("Property method from parent class");
	}
	
	public static void furniture()
	{
		System.out.println("Furniture method from parent class");
	}
	
	
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		
//		p.bike();--> cannot access bike as cyclic inheritance is not valid to access it we have to create an object of child class
		
		
		p.car();
		
		p.farm();// accessing the farm method from Grand parent class
		
		System.out.println(p.i);
	}
	

}
