package polymorphism;

public class Child extends Parent {

	
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
			
	}
	
	
	public void marry()
	{
		System.out.println("marry method from child class");
	}
	
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.home();
		
		c.car();
		
		c.property();
		
		furniture();
	
		c.marry();
		
		
		
		
		
	}
}
