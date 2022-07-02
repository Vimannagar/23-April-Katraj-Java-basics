package inheritance;

public class B extends A {
	
	public B(String s)
	{	super(50);
		System.out.println("zero arg constructor B class");
	}
	
	
	public static void main(String[] args) {
	B b = new B("abc");
		
	}

	
	
}
