package accessmodifiers;

public class A {
	
public	int i = 50;

    static String s = "123"; 
    
    private char c = '1';
    
    
	
	public void m1()
	{
		System.out.println("m1 method from A class");
	}
	
	public static void m2()
	{
		System.out.println("static m2 method from A class");
	}
	
	public static void main(String[] args) {
		System.out.println(s);//123
		
		A a = new A();
		System.out.println(a.c);//1
	}
	
	

}
