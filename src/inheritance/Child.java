package inheritance;

public class Child extends Parent {
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
	}
	
	
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.home();
		
		c.car();
		
		c.property();
		
		furniture();
		
		c.farm();
		
		
		
		
	}
	
	

}
