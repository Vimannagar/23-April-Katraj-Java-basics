package variables;

public class LocalVariable {
	
	int i = 10;// non static variable
	static int l = 20;// static variable
	
	
	public static void main(String[] args) {
		int j = 50;// local variable
		
		
		System.out.println(j);//50
		
		
	}
	
	public void m1()
	{
		String s = "123";
		int j = 50;// local variable
		System.out.println(j);
	}
	
	public static void addition(int a , int b)// a, b - local variable
	{
	int c = a+b;// c - local variable
	
	System.out.println(c);
	

	
	
		
	}

}
