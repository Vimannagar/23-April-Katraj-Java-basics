package polymorphism;

public class A {
	
	
	public A()
	{
		System.out.println("0 argument constructor");
	}
	
	public A(int i)
	{
		System.out.println("1 argument constructor");
	}
	
	public void m1()
	{
		System.out.println("zero argument m1 method");
	}
	
	
	public void m1(int a)
	{
		System.out.println("one argument m1 method with int input");
	}
	
	
	
	
	public static void m1(String a)
	{
		System.out.println("one argument m1 method with string input");
	}
	
	public int m1(int a, int b)
	{
		System.out.println("one argument m1 method with int input");
			
			return 70;
		}
	
	public void m1(int b, String a)
	{
		System.out.println("m1 method with int and String");
	}
	
	public void m1(String a, int b)
	{
		System.out.println("m1 method with String and int");
	}
	
	
	void m1(double d)
	{
		System.out.println("m1 method with string and int v");
	}
	
	private void m1 (String s, String s1)
	{
		System.out.println("m1 method with 2 arguments");
	}
	
	
	
	public static void main(String[] args) {
		A a =new A();
		
		a.m1();
		a.m1(89);
		m1("abc");
		
		a.m1(70, 95);
	}
	
	public static void main() {
		
	}

}
