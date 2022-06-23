package accessmodifiers;

public final class FinalClassMethodVariable {// this class cannot get extends
	
public final String s = "abc";// this variable cannot be redefine


	public final void m1()// this method cannot be overridden
	{
		System.out.println("final m1 method");
		
		System.out.println(s);
		
//		s = "def"; this will give error
	}
	
	public static void main(String[] args) {
		
	}

}
