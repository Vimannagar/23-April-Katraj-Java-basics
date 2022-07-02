package methods;

public class NonStaticMethod {
	
//	syntax: access_modifier return_type name_of_method()
//	{
//		
//	}
	
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
	
	public static void m3()
	{
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		
//	object creation: 
		
//		classname variable_name = new classname();
		
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		
		nsm.m1();
		
		nsm.m2();
		
		
		NonStaticMethod var1 = new NonStaticMethod();
		
		var1.m2();
//		calling of non static method which is in the another class
		NonStaticMethod2 var2 = new NonStaticMethod2();
		
		var2.methodThree();
		
	
	
		
		
		
		
		
	}

}
