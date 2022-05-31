package variables;

public class StaticVariable {
	
//	syntax: static datatype variablename = value;
	
	
	static int a = 50; 
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		System.out.println(StaticVariable2.s);
		
	}
	
	public static void m1()
	{
		System.out.println(a);// calling of static variable inside the static method.
		System.out.println(StaticVariable2.s);// calling of static variable which is in other class in static method
	}
	
	public void m2()
	{
		System.out.println(a);// calling of static variable which is in the same class in non static method
	}
	
	
	

}
