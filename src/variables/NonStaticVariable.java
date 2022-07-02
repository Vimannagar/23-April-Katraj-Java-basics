package variables;

public class NonStaticVariable {
	
	
	String s = "abc";
	
	public static void main(String[] args) {
		
		
		NonStaticVariable var = new NonStaticVariable();
		
		System.out.println(var.s);
		
		m1();
		
		NonStaticVar2 v2 = new NonStaticVar2();
		
		System.out.println(v2.b);
		
	}
	
	public static void m1()
	{
		NonStaticVariable var = new NonStaticVariable();
		
		System.out.println(var.s);
		
		
	}
	
	public void m2()
	{
		System.out.println(s);
	}
	
	
	
	

}
