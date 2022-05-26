package methods;

public class Test {
	
	public static void addition()
	{
		int i  = 50;
		int j = 20;
		
		int k = i+j;
		
		System.out.println(k);
	}		
	
	
	public static void substraction()
	{
		int i  = 50;
		int j = 20;
		
		int k = i-j;
		
		System.out.println(k);
	}
	
	public static void multiplication()
	{
		int i  = 50;
		int j = 20;
		
		int k = i*j;
		
		System.out.println(k);
	}
	
	public static void division()
	{
		double i  = 50;
		double j = 20;
		
		double k = i/j;
		
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		multiplication();
		substraction();
		addition();
		division();
// calling of static method from other class i.e classname.methodname
		StaticMethods.printHello();
	
		Test.substraction();
		
		
		
		
		
	}
	
}
