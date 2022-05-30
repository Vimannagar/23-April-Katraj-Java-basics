package methods;

public class CallingNonStaticMethod {
	
	
	public void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	
	
	public static void m2()
	{
		CallingNonStaticMethod var = new CallingNonStaticMethod();
		var.m1();// calling of non static method from same class inside the static method
		System.out.println("m2 method is executing");
		Test t = new Test();
		t.testCase1();// calling of non static method from other class inside the static method
		
	}
	
	public static void main(String[] args) {
		m2();
		
	}

}
