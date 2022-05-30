package methods;

public class CallingStaticMethod {
	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	
	public static void m2()
	{
		m1();// calling of static method inside another static method
		System.out.println("m2 method");
	}
	
		public static void main(String[] args) {
			m2();
			
			CallingStaticMethod varname = new CallingStaticMethod();
			varname.m3();
		}

	
	public void m3()
	{
		m2();// calling of static method inside non static method
		System.out.println("m3 method");
	}

}
