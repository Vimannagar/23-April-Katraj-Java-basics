package accessmodifiers;

public class E {
	
	public void m1()
	{
		System.out.println("public method from E class");
	}
	
	void m2()
	{
		System.out.println("default method m2 from E class");
	}
	
	private void m3() 
	{
		System.out.println("Private method m3 from E class");
	}
	
	
	public static void main(String[] args) {
		
		E e = new E();
		
		e.m3();
		
	}

}
