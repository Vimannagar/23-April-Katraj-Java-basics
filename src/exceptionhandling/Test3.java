package exceptionhandling;

public class Test3 {
	Test2 t2;
	
	
	public void m2()
	{
		System.out.println("m2 method from Test3 class");
		
		t2.m1();
	}
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		t3.m2();
		
		
	}

}
