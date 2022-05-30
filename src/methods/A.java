package methods;

public class A {

	
	public void m1()
	{
		System.out.println("m1 method");
		B b = new B();
		
		b.m3();
	}
	
	public void m2()
	{
		m1();
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m2();
		
	}
	
	
	
}
