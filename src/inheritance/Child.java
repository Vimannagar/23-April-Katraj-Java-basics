package inheritance;

public class Child extends Parent {
	int i = 10;
	
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
		
		System.out.println(i);//10
		
		System.out.println(this.i);//10
		
		System.out.println(super.i);//50
		
	}
	
	
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.home();
		
		c.car();
		
		c.property();
		
		furniture();
		
		c.farm();
		
		System.out.println(c.i);//10
		
		Parent p = new Parent();
		
		System.out.println(p.i);//50
		
		
		
		
	}
	
	

}
