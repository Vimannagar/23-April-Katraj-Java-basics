package methods;

public class StaticMethods {
	
//	syntax:		 access_modifier static return_type name_of_method()
//				{
//		
//				}
	
	
	
	
	public static void printHello()
	{
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
public static void main(String[] args) {
	printHello();
	addition();
	StaticMethods var = new StaticMethods();
	var.printHello();
	
}

public static void addition()
{
	int i  = 50;
	int j = 20;
	
	int k = i+j;
	
	System.out.println(k);
}



}
