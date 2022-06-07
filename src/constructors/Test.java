package constructors;

public class Test {

	public  Test()
	{
		this("DEF");
		System.out.println("zero arg Constructor is executing");
		
	}
	
	
	public  Test(String s)
	{
		System.out.println(s);
		System.out.println("one arg Constructor is executing");
	}
	
	
	
	public Test(String s, int i)
	{
		System.out.println("2 argument constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Test t1 = new Test();
		
		Test t2 = new Test("Velocity");
		
		Test t3 = new Test("abc", 80);
		
	}
}
